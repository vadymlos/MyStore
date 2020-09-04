package pages;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

@Getter
public class PopUpCartPage {
    private SelenideElement buttonProceedToCheckout = $("[title='Proceed to checkout']");
}
