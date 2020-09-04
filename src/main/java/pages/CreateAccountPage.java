package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class CreateAccountPage {
    private final SelenideElement customerFirstName = $("#customer_firstname");
    private final SelenideElement customerLastName = $("#customer_lastname");
    private final SelenideElement customerEmail = $("#email");
    private final SelenideElement customerPassword = $("#passwd");
    private final SelenideElement customerFirstNameAddressBlock = $x("//div[@class='account_creation']//input[@id='firstname']");
    private final SelenideElement customerLastNameAddressBlock = $x("//div[@class='account_creation']//input[@id='lastname']");
    private final SelenideElement customerCompany = $("#company");
    private final SelenideElement customerAddress = $("#address1");
    private final SelenideElement customerCity = $("#city");
    private final SelenideElement customerState = $x("//select[@id='id_state']//option[@value='5']");
    private final SelenideElement customerZip = $x("//input[@id='postcode']");
    private final SelenideElement customerCountry = $x("//select[@id='id_country']//option[@value='21']");
    private final SelenideElement customerMobilePhone = $("#phone_mobile");
    private final SelenideElement customerAddressAlias = $("#alias");
    private final SelenideElement customerRegisterButton = $("#submitAccount");
}
