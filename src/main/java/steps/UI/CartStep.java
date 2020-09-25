package steps.UI;

import com.codeborne.selenide.Condition;
import entity.NewUser;
import io.qameta.allure.Step;
import pages.CartPage;

public class CartStep extends NewUser {
    CartPage cartPage = new CartPage();
    NewUser newUser = new NewUser();

    @Step("Check quantity in the cart")
    public void checkProductInCart(){
        cartPage.getQuantityOfProducts().shouldHave(Condition.attribute("value", "1"));
    }

    @Step("Check available in stock")
    public void checkAvailableInStock(){
        cartPage.getAvailableInStock().shouldHave(Condition.text("In stock"));
    }

    @Step("Click the button Proceed to checkout on summary page")
    public void clickButtonProceedToCheckoutSummaryPage(){
        cartPage.getButtonProceedToCheckoutSummary().click();
    }

    @Step("Check address street on address page")
    public void checkAddressStreet(String string){
        cartPage.getAddressStreet().shouldHave(Condition.text(getAddress()));
    }

    @Step("Check city on address page")
    public void checkAddressCity(String string){
        cartPage.getAddressState().shouldHave(Condition.text(getCity()));
    }

    @Step("Check country on address page")
    public void checkAddressCountry(String string){
        cartPage.getAddressState().shouldHave(Condition.text(getCountry()));
    }

    @Step("Check mobile phone on address page")
    public void checkAddressMobilePhone(String string){
        cartPage.getAddressState().shouldHave(Condition.text(getMobPhone()));
    }

    @Step("Click the button proceed to checkout on address page")
    public void clickButtonProceedToCheckoutOnAddressPage(){
        cartPage.getButtonProceedToCheckoutAddress().click();
    }

    @Step("Check radio button delivery")
    public void checkRadioButtonDelivery(){
        cartPage.getRadioDelivery().shouldHave(Condition.attribute("checked", "checked"));
    }

    @Step("Activate checkbox agreement to term of service")
    public void activateCheckboxAgreementOfService(){
        cartPage.getCheckboxAgreeService().exists();
    }

    @Step("Click the button proceed to checkout on shipping page")
    public void clickButtonProceedToCheckoutOnShippingPage(){
        cartPage.getButtonProceedToCheckoutShipping().click();
    }


}
