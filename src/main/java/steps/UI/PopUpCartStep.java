package steps.UI;

import io.qameta.allure.Step;
import pages.PopUpCartPage;

public class PopUpCartStep {
    PopUpCartPage popUpCartPage = new PopUpCartPage();

    @Step("Click the button Proceed to checkout in the pop up cart")
    public void clickButtonProceedToCheckout(){
        popUpCartPage.getButtonProceedToCheckout().click();
    }
}
