package com.qaguru.pages;

import helpers.TestingProperties;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    private TestingProperties cfg = ConfigFactory.create(TestingProperties.class);

    public void authorizationForm() {
        $("button[data-test=util-bar-account-dropdown]").click();
        $("button[kind='secondary']").click();
        $("#username").val(cfg.username());
        $("#password").val(cfg.password());
        $("#loginBtn").click();
    }

}
