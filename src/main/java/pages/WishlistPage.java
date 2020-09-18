package pages;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class WishlistPage {
    private SelenideElement quantityProductsInWishlist = $x("//div[@id='mywishlist']//td[@class='bold align_center']");
    private SelenideElement tableWishlist = $("#block-history");
    private SelenideElement linkMyWishlist = $x("(//div[@id='block-history']//a[@href='javascript:;'])[1]");
    private SelenideElement checkProductInWishlist = $("#s_title");
}
