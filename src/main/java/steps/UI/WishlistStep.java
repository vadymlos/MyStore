package steps.UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.WishlistPage;

public class WishlistStep {
    WishlistPage wishlistPage = new WishlistPage();

    @Step("Check quantity of products")
    public void checkQuantityOfProducts(){
        wishlistPage.getQuantityProductsInWishlist().shouldHave(Condition.text("1"));
    }

    @Step("Click the link my wishlist")
    public void clickTheLinkMyWishlist(){
        wishlistPage.getLinkMyWishlist().click();
    }

    @Step("Check product in wishlist")
    public void checkProductInWishlist(){
        wishlistPage.getCheckProductInWishlist().shouldHave(Condition.text("Printed Dress"));
    }
}
