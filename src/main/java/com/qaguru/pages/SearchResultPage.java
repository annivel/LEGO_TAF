package com.qaguru.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.qaguru.model.PriceRangeLabel;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class SearchResultPage {

    @Step("select the category of the item")
    public void categorySelect() {
        SelenideElement element = $("button[data-analytics-title='themes']");

        actions().moveToElement(element).click().build().perform();
        $("a[data-analytics-title='batman']").click();
    }

    @Step("filter the items relative to the price")
    public void clickOnPriceCheckbox(PriceRangeLabel priceRangeLabel) {
        $$x("//span[text()='Price']/ancestor::button/following-sibling::div//label")
                .find((Condition.text(priceRangeLabel.getPrice())))
                .click();
    }

    @Step("add the product to the basket")
    public void addToBag() {
        if (!$("button[kind='disabled']").isDisplayed()) {
            $("button[kind='product']").click();
        }
    }

}
