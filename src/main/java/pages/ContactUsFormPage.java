package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ContactUsFormPage {
    private SelenideElement dropDownSubjectHeading = $("#id_contact");
    private SelenideElement dropDownItemSubjectHeading = $(byText("Customer service"));
    private SelenideElement dropDownOrderReference = $x("//div[@class='form-group selector1']//select[@name='id_order']");
    private SelenideElement dropDownItemOrderReference = $x("(//select[@name='id_order']//option)[2]");
    private SelenideElement textAreaMessage = $("#message");
    private SelenideElement buttonSend = $("#submitMessage");
    private SelenideElement confirmYourMessageHasBeenSuccessfullySent = $x("//div[@id='center_column']//p[@class='alert alert-success']");
}
