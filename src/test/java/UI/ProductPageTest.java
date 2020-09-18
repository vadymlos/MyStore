package UI;

import org.testng.annotations.Test;
import steps.UI.MainStep;
import steps.UI.ProductStep;

public class ProductPageTest extends BaseTest{
    MainStep mainStep = new MainStep();
    ProductStep productStep = new ProductStep();

    @Test(description = "Check products components")
    public void shouldCanHaveAllComponents(){
        mainStep.clickTheButtonBestSellers();
        mainStep.hoverCursorOnProduct();
        mainStep.clickTheButtonMore();
        productStep.checkAddToWishList();
        productStep.checkModelOfProduct();
        productStep.checkPresenceButtonAddToCart();
        productStep.checkPresenceInputQuantity();
        productStep.checkPresenceSelectSize();
    }
}
