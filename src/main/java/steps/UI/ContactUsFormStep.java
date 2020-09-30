package steps.UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.ContactUsFormPage;

public class ContactUsFormStep {
    ContactUsFormPage contactUsFormPage = new ContactUsFormPage();

    @Step("Choose custom service in dropdown subject heading")
    public void chooseCustomServiceInDropDownSubjectHeading(){
        contactUsFormPage.getDropDownSubjectHeading().click();
        contactUsFormPage.getDropDownItemSubjectHeading().click();
    }

    @Step("Choose first item in dropdown order reference")
    public void chooseItemInDropDownOrderReference(){
        contactUsFormPage.getDropDownOrderReference().click();
        contactUsFormPage.getDropDownItemOrderReference().click();
    }

    @Step("Enter text to message text area")
    public void enterTextToMessageTextArea(){
        contactUsFormPage.getTextAreaMessage().setValue("Test message for support");
    }

    @Step("Click the button Send")
    public void clickButtonSend(){
        contactUsFormPage.getButtonSend().click();
    }

    @Step("Check alert Your message has been successfully sent to our tean")
    public void checkAlertYourMessageHasBeenSuccessfullySent(){
        contactUsFormPage.getConfirmYourMessageHasBeenSuccessfullySent().shouldHave(Condition.text("Your message has been successfully sent to our team."));
    }
}
