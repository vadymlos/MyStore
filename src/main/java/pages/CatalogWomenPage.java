package pages;
import lombok.Getter;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;

@Getter
public class CatalogWomenPage {
    private SelenideElement buttonCreateAnAccount = $x("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line']//img[@title='Printed Dress']");
    private SelenideElement buttonCre = buttonCreateAnAccount.find("[title='Add to cart']");
}
