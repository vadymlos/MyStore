package pages;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class MyAccountPage {
    private SelenideElement myAccountText = $(byText("My account"));
    private SelenideElement myPersonalInformationText = $(byText("My personal information"));
    private SelenideElement signOutText = $(byText("Sign out"));
}
