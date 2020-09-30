package UI;

import entity.NewUser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.UI.*;
import utils.RandomEmail;

public class ContactUsTest extends BaseTest{
    MainStep mainStep = new MainStep();
    CatalogWomenStep catalogWomenStep = new CatalogWomenStep();
    PopUpCartStep popUpCartStep = new PopUpCartStep();
    CartStep cartStep = new CartStep();
    AuthenticationStep authenticationStep = new AuthenticationStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    LoginStep loginStep = new LoginStep();
    MyAccountStep myAccountStep = new MyAccountStep();
    ContactUsFormStep contactUsFormStep = new ContactUsFormStep();

    NewUser newUser1 = new NewUser(RandomEmail.randomUserName());
    NewUser newUser = new NewUser("Jack", "Test", "Test01", "Pdf", "Street", "Denver", "98555", "33345345454", "Green street");
    NewUser newUser2 = new NewUser(newUser1.getEmail(), newUser.getPassword());

    String country = "United States";

    @BeforeMethod
    public void setUpUi(){
        mainStep.clickOnSignInButton();
        authenticationStep.fillEmailField(newUser1);
        authenticationStep.clickCreateAnAccountButton();
        createAccountStep.fillCreateAccountForm(newUser);
        createAccountStep.chooseState();
        createAccountStep.clickRegisterButton();
        mainStep.clickOnSignOutButton();

        loginStep.loginUser(newUser2);
        myAccountStep.checkTextMyAccount();
        myAccountStep.checkTextMyPersonalInformation();
        myAccountStep.checkTextSignOut();

        mainStep.clickBlockOfCatalogWomen();
        catalogWomenStep.hoverOnProduct();
        catalogWomenStep.clickTheButtonAddToCart();
        popUpCartStep.clickButtonProceedToCheckout();
        cartStep.checkProductInCart();
        cartStep.checkAvailableInStock();

        cartStep.clickButtonProceedToCheckoutSummaryPage();
        cartStep.checkAddressStreet(newUser.getAddress());
        cartStep.checkAddressCity(newUser.getCity(), newUser.getZip());
        cartStep.checkAddressCountry(country);
        cartStep.checkAddressMobilePhone(newUser.getMobPhone());
        cartStep.clickButtonProceedToCheckoutOnAddressPage();
        cartStep.checkRadioButtonDelivery();
        cartStep.activateCheckboxAgreementOfService();
        cartStep.clickButtonProceedToCheckoutOnShippingPage();
        cartStep.clickButtonPayBankWire();
        cartStep.checkTextBlockBankWirePayment();
        cartStep.clickButtonConfirmMyOrder();
    }

    @Test(description = "Send contact us form")
    public void shouldCanSendContactUsForm(){
        cartStep.clickButtonContactUs();
        contactUsFormStep.chooseCustomServiceInDropDownSubjectHeading();
        contactUsFormStep.chooseItemInDropDownOrderReference();
        contactUsFormStep.enterTextToMessageTextArea();
        contactUsFormStep.clickButtonSend();
        contactUsFormStep.checkAlertYourMessageHasBeenSuccessfullySent();
    }
}
