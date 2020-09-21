package steps.UI;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.MyAccountPage;

public class MyAccountStep {
    private MyAccountPage myAccountPage = new MyAccountPage();

    @Step("Check for text 'My Account' ")
    public void checkTextMyAccount(){
        myAccountPage.getMyAccountText().shouldHave(Condition.text("My account"));
    }

    @Step("Check for text 'My Personal Information' ")
    public void checkTextMyPersonalInformation(){
        myAccountPage.getMyPersonalInformationText().shouldHave(Condition.text("My personal information"));
    }

    @Step("Check for text 'Sign out' ")
    public void checkTextSignOut(){
        myAccountPage.getSignOutText().shouldHave(Condition.text("Sign out"));
    }

    @Step("Click the button my wishlist")
    public void clickTheButtonMyWishlist(){
        myAccountPage.getButtonMyWishlists().click();
    }

    @Step("Click the button return to home page")
    public void clickTheButtonReturnToHomePage(){
        myAccountPage.getButtonReturnToHomePage().click();
    }
}
