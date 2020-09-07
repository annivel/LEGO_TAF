package helpers;

import com.codeborne.selenide.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CustomWebDriver implements WebDriverProvider {

    private static TestingProperties cfg = ConfigFactory.create(TestingProperties.class);

    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        capabilities.setCapability("screenResolution", "1920x1080");


        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
        capabilities.setCapability(CapabilityType.BROWSER_VERSION, "latest");
        try {
            return new RemoteWebDriver(new URL(cfg.remoteUrl()), capabilities);
        } catch (final MalformedURLException e) {
            throw new RuntimeException("Unable to create driver", e);
        }
    }
}
