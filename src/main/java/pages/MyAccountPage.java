package pages;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MyAccountPage {
    private SelenideElement myAccountText = $(byText("My account"));
    private SelenideElement myPersonalInformationText = $(byText("My personal information"));
    private SelenideElement signOutText = $(byText("Sign out"));
    private SelenideElement buttonMyWishlists = $x("//li[@class='lnk_wishlist']//a[@title='My wishlists']");
    private SelenideElement buttonReturnToHomePage = $x("//a[@title='Return to Home']");
}
