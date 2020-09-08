package com.qaguru.pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class OverlapForm {

    @Step("close the overlap form")
    public void closeOverlap() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf($("button[kind='lightTheme']")))
                .click();
    }

    @Step("close the cookies form")
    public void closeCookiesAlert() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable($("button[kind='primary']")))
                .click();
    }

}
