package tests;

import org.junit.jupiter.api.Test;
import pages.OverlapForm;
import pages.ProductSelect;

import static com.codeborne.selenide.Selenide.open;

public class LegoTests {
    @Test
    void legoUITest() {
        open("https://www.lego.com/");

        OverlapForm overlap = new OverlapForm();
        overlap.closeOverlap();
        overlap.closeCookiesAlert();

       /* AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.authorizationForm();
*/
        ProductSelect productSelect = new ProductSelect();
        productSelect.categorySelect();
    }

}

