package pages;
import lombok.Getter;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;

@Getter
public class CatalogWomenPage {
    private SelenideElement buttonCreateAnAccount = $("#SubmitCreate");
}
