package steps.UI;

import com.codeborne.selenide.Condition;
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
}
