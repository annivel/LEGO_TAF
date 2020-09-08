package com.qaguru.pages;

import com.codeborne.selenide.WebDriverRunner;
import helpers.TestingProperties;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.open;

public class WebsitePage {

    private TestingProperties cfg = ConfigFactory.create(TestingProperties.class);

    @Step("open the main page of the website")
    public void openURL() {
        open(cfg.website());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

}
