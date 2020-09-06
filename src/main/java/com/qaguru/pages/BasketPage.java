package com.qaguru.pages;

import com.codeborne.selenide.Condition;
import helpers.TestingProperties;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    private TestingProperties cfg = ConfigFactory.create(TestingProperties.class);

    public void openBasket() {
        $("a[data-test='util-bar-cart']").click();
    }

    public void verifyProductQuantity() {
        openBasket();
        int count = Integer.parseInt($("input[data-test='quantity-value']").val());
        if (count == 3) {
            $("button[data-test='remove-from-cart']").click();
        }
    }

    public void verifyProductName() {
        $x(String.format("//span[starts-with(text(),'%s')]", cfg.product()))
                .shouldHave(Condition.text(cfg.product()));
    }

}

