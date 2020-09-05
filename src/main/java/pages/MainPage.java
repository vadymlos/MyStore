package pages;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MainPage {
    private SelenideElement buttonSignIn = $x("//header[@id = 'header']//div[@class = 'header_user_info']");
    private SelenideElement buttonWomenInCatalogue = $x("//a[@title='Women']");
    private SelenideElement buttonSignOut = $x("//div[@class='header_user_info']//a[@class='logout']");
}
