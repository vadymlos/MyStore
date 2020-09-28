package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class ContactUsFormPage {
    private SelenideElement dropDownSubjectHeading = $("#id_contact");
    private SelenideElement dropDownItemSubjectHeading = $(byText("Customer service"));
    private SelenideElement textAreaMessage = $("#message");
}
