package pages;

import lombok.Getter;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;

@Getter
public class AuthenticationPage {
    private SelenideElement buttonCreateAnAccount = $("#SubmitCreate");
    private SelenideElement emailForCreateAccount = $("#email_create");
    private SelenideElement emailForLogin = $("#email");
    private SelenideElement passwordForLogin = $("#passwd");
    private SelenideElement buttonSignIn = $("#SubmitLogin");

}
