package steps.UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.CartPage;
import pages.CatalogWomenPage;
import pages.PopUpCartPage;

public class CatalogWomenStep {
    CatalogWomenPage catalogWomenPage = new CatalogWomenPage();
    CartPage cartPage = new CartPage();

    @Step("Hover on product")
    public void hoverOnProduct(){
        catalogWomenPage.getProductInCatalog().hover();
    }

    @Step("Click the button Add to cart")
    public void clickTheButtonAddToCart(){
        catalogWomenPage.getButtonAddToCart().click();
    }
}
