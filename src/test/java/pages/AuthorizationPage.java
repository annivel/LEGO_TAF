package pages;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    final String USERNAME = "annivelichko@gmail.com";
    final String PASSWORD = "annivelichko";

    public void authorizationForm() {
        $("button[data-test=util-bar-account-dropdown]").click();
        $("button[kind='secondary']").click();
        $("#username").val(USERNAME);
        $("#password").val(PASSWORD);
        $("#loginBtn").click();
    }

}
