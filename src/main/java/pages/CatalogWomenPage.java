package pages;
import lombok.Getter;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

@Getter
public class CatalogWomenPage {
    private SelenideElement productInCatalog = $x("(//img[@title='Printed Dress'])[1]");
    private SelenideElement buttonAddToCart = $x("(//div[@class='button-container']//a[@class='button ajax_add_to_cart_button btn btn-default'])[3]");
}
