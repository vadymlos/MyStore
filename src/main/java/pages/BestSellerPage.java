package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class BestSellerPage {
    private SelenideElement buttonMoreOnProduct = $x("(//ul[@id='blockbestsellers']//a[@title = 'View'])[1]");
}
