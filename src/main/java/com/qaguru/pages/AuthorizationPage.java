package com.qaguru.pages;

import helpers.TestingProperties;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    private TestingProperties cfg = ConfigFactory.create(TestingProperties.class);

    @Step("Sign in to the exist account")
    public void authorizationForm() {
        $("button[data-test=util-bar-account-dropdown]").click();
        $("button[kind='secondary']").click();
        $("#username").val(cfg.username());
        $("#password").val(cfg.password());
        $("#loginBtn").click();
    }

}
