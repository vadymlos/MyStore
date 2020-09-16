package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ProductPage {
    private SelenideElement blockDescription = $("#short_description_content");
    private SelenideElement buttonAddToWishList = $("#wishlist_button");
    private SelenideElement buttonAddToCart = $x("//p[@id = 'add_to_cart']//button[@name='Submit']");
    private SelenideElement inputQuantity = $x("//p[@id = 'quantity_wanted_p']//input[@id='quantity_wanted']");
    private SelenideElement selectSize = $x("//div[@id = 'uniform-group_1']//select[@id='group_1']");
    private SelenideElement buttonReview = $("#new_comment_tab_btn");
}
