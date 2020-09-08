package com.qaguru.tests;


import com.codeborne.selenide.Configuration;
import com.qaguru.model.PriceRangeLabel;
import com.qaguru.pages.BasketPage;
import com.qaguru.pages.OverlapForm;
import com.qaguru.pages.SearchResultPage;
import com.qaguru.pages.WebsitePage;
import helpers.CustomWebDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LegoTests {
    @BeforeAll
    public static void setUp() {
        Configuration.browser = CustomWebDriver.class.getName();
        Configuration.driverManagerEnabled = false;
    }

    @Test
    void legoUITest() {
        WebsitePage website = new WebsitePage();
        OverlapForm overlap = new OverlapForm();
        // AuthorizationPage authorizationPage = new AuthorizationPage();
        SearchResultPage searchResultPage = new SearchResultPage();
        BasketPage basketPage = new BasketPage();

        website.openURL();

        overlap.closeOverlap();
        overlap.closeCookiesAlert();

        // authorizationPage.authorizationForm();
        searchResultPage.categorySelect();
        searchResultPage.clickOnPriceCheckbox(PriceRangeLabel.RANGE_100);
        searchResultPage.addToBag();

        basketPage.verifyProductQuantity();
        basketPage.verifyProductName();
    }

}

