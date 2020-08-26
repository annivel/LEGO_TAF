package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ProductSelect {

    public void categorySelect() {
        SelenideElement element = $("button[data-analytics-title='themes']");
        actions().moveToElement(element).click().build().perform();
        $("a[data-analytics-title='batman']").click();
    }

    public void checkboxSelectPrice() {

    }
}
