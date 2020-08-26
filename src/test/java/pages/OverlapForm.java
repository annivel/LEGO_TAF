package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class OverlapForm {
    private static int overlayCounter = 0;
    private static int defaultTries = 3;
    private static int overlayCounter2 = 0;
    private static int defaultTries2 = 3;

    public void closeOverlap() {
        while ($("div[data-test='age-gate-overlay']").is(Condition.visible)) {
            Selenide.Wait().withTimeout(Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf($("button[kind='lightTheme']")))
                    .click();
            boolean isOverlayDisplay = $("div[data-test='age-gate-overlay']").isDisplayed();
            if (!isOverlayDisplay || ++overlayCounter == defaultTries)
                break;
        }
    }

    public void closeCookiesAlert() {
        while ($("div[data-test='cookie-banner']").is(Condition.visible)) {
            Selenide.Wait().withTimeout(Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable($("button[kind='primary']")))
                    .click();
            boolean isOverlayDisplay = $("div[data-test='cookie-banner']").isDisplayed();
            if (!isOverlayDisplay || ++overlayCounter2 == defaultTries2)
                break;
        }
    }
}
