package com.qaguru.tests;

import com.qaguru.model.PriceRangeLabel;
import com.qaguru.pages.BasketPage;
import com.qaguru.pages.OverlapForm;
import com.qaguru.pages.SearchResultPage;
import com.qaguru.pages.WebsitePage;
import org.junit.jupiter.api.Test;

public class LegoTests {

    @Test
    void legoUITest() {

        WebsitePage website = new WebsitePage();
        website.openURL();

        OverlapForm overlap = new OverlapForm();
        overlap.closeOverlap();
        overlap.closeCookiesAlert();

     /*   AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.authorizationForm();*/

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.categorySelect();
        searchResultPage.clickOnPriceCheckbox(PriceRangeLabel.RANGE_100);
        searchResultPage.addToBag();

        BasketPage basketPage = new BasketPage();
        basketPage.verifyProductPrice();
    }

}

