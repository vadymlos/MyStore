package steps.UI;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import okhttp3.Cookie;
import pages.MainPage;

import java.util.List;

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

    @Step("Click the block of catalog Women")
    public void clickBlockOfCatalogWomen(){
        mainPage.getBlockWomenInCatalogue().click();
    }

//    @Step("Set cookie")
//    public void setUserCookie(List<Cookie> cookies){
//        WebDriverRunner.getWebDriver().manage().addCookie(cookies.get(0));
//    }
    @Step("Click the button Best Sellers")
    public void clickTheButtonBestSellers(){
        mainPage.getButtonBestSeller().click();
    }

    @Step("Hover cursor on product")
    public void hoverCursorOnProduct(){
        mainPage.getProductBlock().hover();
    }
    @Step("Click the button More")
    public void clickTheButtonMore(){
        mainPage.getButtonMoreOnProduct().waitUntil(Condition.visible.because("Registration button not visible"), 5000).click();
    }

    @Step("Click the button account")
    public void clickTheButtonAccount(){
        mainPage.getButtonAccount().click();
    }
}
