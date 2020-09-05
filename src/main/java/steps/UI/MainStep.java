package steps.UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.MainPage;

public class MainStep {
    private MainPage mainPage = new MainPage();

    @Step("Click on SignIn button on main page")
    public void clickOnSignInButton(){
        mainPage.getButtonSignIn().waitUntil(Condition.visible.because("Registration button not visible"), 5000).click();
    }

    @Step("Click on SignIn button on main page")
    public void clickOnSignOutButton(){
        mainPage.getButtonSignOut().click();
    }
}
