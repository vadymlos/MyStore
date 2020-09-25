package pages;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class OrderHistoryPage {
    private SelenideElement statusOnBackorder = $x("(//td[@class='history_state']//span[@class='label dark'])[1]");
}
