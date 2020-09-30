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
    private SelenideElement buttonProceedToCheckoutSummary = $x("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");
    private SelenideElement buttonProceedToCheckoutAddress = $x("//p[@class='cart_navigation clearfix']//button[@name='processAddress']");
    private SelenideElement buttonProceedToCheckoutShipping = $x("//p[@class='cart_navigation clearfix']//button[@name='processCarrier']");
    private SelenideElement checkboxAgreeService = $("#cgv");
    private SelenideElement addressStreet = $x("//ul[@id='address_invoice']//li[@class='address_address1 address_address2']");
    private SelenideElement addressState = $x("//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode']");
    private SelenideElement addressCountry = $x("//ul[@id='address_invoice']//li[@class='address_country_name']");
    private SelenideElement addressPhone = $x("//ul[@id='address_invoice']//li[@class='address_phone_mobile']");
    private SelenideElement radioDelivery = $x("//table[@class='resume table table-bordered']//input[@class='delivery_option_radio']");
    private SelenideElement buttonPayByBankWire = $(".bankwire");
    private SelenideElement textBlockBankWirePayment = $x("//div[@class='box cheque-box']//h3[@class='page-subheading']");
    private SelenideElement buttonConfirmMyOrder = $x("//p[@class='cart_navigation clearfix']//button[@type='submit']");
    private SelenideElement linkBackToOrders = $x("//p[@class='cart_navigation exclusive']//a[@title='Back to orders']");
    private SelenideElement buttonContactUs = $("#contact-link");
}
