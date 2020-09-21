package UI;

import entity.NewUser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.UI.*;
import utils.RandomEmail;

public class RegistrationLoginAddToWishlistTest extends BaseTest{
    NewUser newUser1 = new NewUser(RandomEmail.randomUserName());
    NewUser newUser = new NewUser("Jack", "Test", "Test01", "Pdf", "Street", "Denver", "98555", "33345345454", "Green street");
    NewUser newUser2 = new NewUser(newUser1.getEmail(), newUser.getPassword());

    MainStep mainStep = new MainStep();
    AuthenticationStep authenticationStep = new AuthenticationStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    MyAccountStep myAccountStep = new MyAccountStep();
    LoginStep loginStep = new LoginStep();
    ProductStep productStep = new ProductStep();
    WishlistStep wishlistStep = new WishlistStep();

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
        myAccountStep.clickTheButtonReturnToHomePage();
    }

    @Test(description = "Add product to wishlist")
    public void shouldCanAddProductToWishlist(){
        mainStep.clickTheButtonBestSellers();
        mainStep.hoverCursorOnProduct();
        mainStep.clickTheButtonMore();
        productStep.clickOnAddToWishList();
        productStep.checkPopUpAddToWishlist();
        productStep.clickTheButtonCloseOnWishlistPopUp();
        mainStep.clickTheButtonAccount();
        myAccountStep.clickTheButtonMyWishlist();
        wishlistStep.clickTheLinkMyWishlist();
        wishlistStep.checkProductInWishlist();
    }
}
