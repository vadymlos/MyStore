package pages;
import lombok.Getter;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;

@Getter
public class CartPage {
    private SelenideElement quantityOfProducts = $x("//td[@class='cart_quantity text-center']//input[@class='cart_quantity_input form-control grey']");
    private SelenideElement availableInStock = $x("//td[@class='cart_avail']//span[@class='label label-success']");
}
