package steps.UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.ProductPage;

public class ProductStep {
    ProductPage productPage = new ProductPage();

    @Step("Check model of product")
    public void checkModelOfProduct(){
        productPage.getBlockModel().shouldHave(Condition.text("Model"));
    }

    @Step("Check presence link add to wishlist")
    public void checkAddToWishList(){
        productPage.getButtonAddToWishList().shouldHave(Condition.attribute("title", "Add to my wishlist"));
    }

    @Step("Check presence button add to cart")
    public void checkPresenceButtonAddToCart(){
        productPage.getButtonAddToCart().shouldHave(Condition.text("Add to cart"));
    }

    @Step("Check presence input Quantity")
    public void checkPresenceInputQuantity(){
        productPage.getInputQuantity().shouldHave(Condition.attribute("value", "1"));
    }

    @Step("Check presence select Size")
    public void checkPresenceSelectSize(){
        productPage.getSelectSize().shouldHave(Condition.attribute("name", "group_1"));
    }

    @Step("Click on link add to wishlist")
    public void clickOnAddToWishList(){
        productPage.getButtonAddToWishList().click();
    }

    @Step("Check pop up add to wishlist")
    public void checkPopUpAddToWishlist(){

    }
}
