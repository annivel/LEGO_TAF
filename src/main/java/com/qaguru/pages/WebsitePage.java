package com.qaguru.pages;

import helpers.TestingProperties;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.open;

public class WebsitePage {

    private TestingProperties cfg = ConfigFactory.create(TestingProperties.class);

    public void openURL() {
        open(cfg.website());
    }

}
