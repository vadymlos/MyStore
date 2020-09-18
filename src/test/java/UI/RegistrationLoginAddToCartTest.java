package UI;

import entity.NewUser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import steps.UI.*;
import utils.RandomEmail;

public class RegistrationLoginAddToCartTest extends BaseTest{
    MainStep mainStep = new MainStep();
    CatalogWomenStep catalogWomenStep = new CatalogWomenStep();
    PopUpCartStep popUpCartStep = new PopUpCartStep();
    CartStep cartStep = new CartStep();
    AuthenticationStep authenticationStep = new AuthenticationStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    LoginStep loginStep = new LoginStep();
    MyAccountStep myAccountStep = new MyAccountStep();

    NewUser newUser1 = new NewUser(RandomEmail.randomUserName());
    NewUser newUser = new NewUser("Jack", "Test", "Test01", "Pdf", "Street", "Denver", "98555", "33345345454", "Green street");
    NewUser newUser2 = new NewUser(newUser1.getEmail(), newUser.getPassword());

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
    }

    @Test(description = "Add product to cart for login user")
    public void shouldCanLoginUserAddProductToCart(){
        mainStep.clickBlockOfCatalogWomen();
        catalogWomenStep.hoverOnProduct();
        catalogWomenStep.clickTheButtonAddToCart();
        popUpCartStep.clickButtonProceedToCheckout();
        cartStep.checkProductInCart();
        cartStep.checkAvailableInStock();
    }
}
