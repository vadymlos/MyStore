package steps.UI;

import com.codeborne.selenide.Condition;
import entity.NewUser;
import io.qameta.allure.Step;
import pages.CartPage;

public class CartStep {
    CartPage cartPage = new CartPage();

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
        cartPage.getAddressStreet().shouldHave(Condition.text(string));
    }

    @Step("Check city on address page")
    public void checkAddressCity(String city, String zip){
//        cartPage.getAddressState().shouldHave(Condition.text(city + ", " + state + " " + zip));
        cartPage.getAddressState().shouldHave(Condition.text(city));
        cartPage.getAddressState().shouldHave(Condition.text(zip));
    }

    @Step("Check country on address page")
    public void checkAddressCountry(String string){
        cartPage.getAddressCountry().shouldHave(Condition.text(string));
    }

    @Step("Check mobile phone on address page")
    public void checkAddressMobilePhone(String string){
        cartPage.getAddressPhone().shouldHave(Condition.text(string));
    }

    @Step("Click the button proceed to checkout on address page")
    public void clickButtonProceedToCheckoutOnAddressPage(){
        cartPage.getButtonProceedToCheckoutAddress().click();
    }

    @Step("Check radio button delivery")
    public void checkRadioButtonDelivery(){
        cartPage.getRadioDelivery().shouldHave(Condition.attribute("checked", "true"));
    }

    @Step("Activate checkbox agreement to term of service")
    public void activateCheckboxAgreementOfService(){
        cartPage.getCheckboxAgreeService().click();
    }

    @Step("Click the button proceed to checkout on shipping page")
    public void clickButtonProceedToCheckoutOnShippingPage(){
        cartPage.getButtonProceedToCheckoutShipping().click();
    }

    @Step("Click the button Pay by bank wire")
    public void clickButtonPayBankWire(){
        cartPage.getButtonPayByBankWire().click();
    }

    @Step("Check text block Bank-Wire Payment")
    public void checkTextBlockBankWirePayment(){
        cartPage.getTextBlockBankWirePayment().shouldHave(Condition.text("Bank-wire payment."));
    }

    @Step("Click the button I confirm my order")
    public void clickButtonConfirmMyOrder(){
        cartPage.getButtonConfirmMyOrder().click();
    }

    @Step("Click the link Back to orders")
    public void clickLinkBackToOrders(){
        cartPage.getLinkBackToOrders().click();
    }

    @Step("Click the button contact us")
    public void clickButtonContactUs(){
        cartPage.getButtonContactUs().click();
    }
}
