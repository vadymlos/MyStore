package UI;

import org.testng.annotations.Test;
import steps.UI.CartStep;
import steps.UI.CatalogWomenStep;
import steps.UI.MainStep;
import steps.UI.PopUpCartStep;

public class AddToCartTest extends BaseTest{
    MainStep mainStep = new MainStep();
    CatalogWomenStep catalogWomenStep = new CatalogWomenStep();
    PopUpCartStep popUpCartStep = new PopUpCartStep();
    CartStep cartStep = new CartStep();

    @Test(description = "Add product to cart for log out user")
    public void shouldCanAddProductToCart(){
        mainStep.clickBlockOfCatalogWomen();
        catalogWomenStep.hoverOnProduct();
        catalogWomenStep.clickTheButtonAddToCart();
        popUpCartStep.clickButtonProceedToCheckout();
        cartStep.checkProductInCart();
        cartStep.checkAvailableInStock();
    }
}
