package com.qaguru.tests;


import com.qaguru.model.PriceRangeLabel;
import com.qaguru.pages.*;
import helpers.TestBase;
import org.junit.jupiter.api.Test;

public class LegoTests extends TestBase {

    @Test
    void legoUITest() {
        WebsitePage website = new WebsitePage();
        OverlapForm overlap = new OverlapForm();
        AuthorizationPage authorizationPage = new AuthorizationPage();
        SearchResultPage searchResultPage = new SearchResultPage();
        BasketPage basketPage = new BasketPage();

        website.openURL();

        overlap.closeOverlap();
        overlap.closeCookiesAlert();

        authorizationPage.authorizationForm();
        searchResultPage.categorySelect();
        searchResultPage.clickOnPriceCheckbox(PriceRangeLabel.RANGE_100);
        searchResultPage.addToBag();

        basketPage.verifyProductQuantity();
        basketPage.verifyProductName();
    }
}
