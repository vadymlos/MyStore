package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ProductPage {
    private SelenideElement blockDescription = $("#short_description_content");
}
