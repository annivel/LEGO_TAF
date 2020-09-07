package com.qaguru.tests;


import com.qaguru.model.PriceRangeLabel;
import com.qaguru.pages.*;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class LegoTests {

    @Test
    void legoUITest() {
        WebsitePage website = new WebsitePage();
        OverlapForm overlap = new OverlapForm();
        AuthorizationPage authorizationPage = new AuthorizationPage();
        SearchResultPage searchResultPage = new SearchResultPage();
        BasketPage basketPage = new BasketPage();

        //Configuration.headless = true;

        step("open the main page of the website");
        website.openURL();

        step("close the overlap form and cookies form", () -> {
            overlap.closeOverlap();
            overlap.closeCookiesAlert();
        });

        step("Sign in to the exist account");
        authorizationPage.authorizationForm();

        step("select the category of the item");
        searchResultPage.categorySelect();

        step("filter the items relative to the price", () -> {
            searchResultPage.clickOnPriceCheckbox(PriceRangeLabel.RANGE_100);
        });

        step("add the product to the basket");
        searchResultPage.addToBag();

        step("verify the quantity of the product in the basket");
        basketPage.verifyProductQuantity();

        step("verify the product name of the item in the basket");
        basketPage.verifyProductName();
    }

}

