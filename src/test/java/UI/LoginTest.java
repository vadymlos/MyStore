package UI;

import entity.NewUser;
import org.testng.annotations.Test;
import steps.UI.*;
import utils.RandomEmail;

public class LoginTest extends BaseTest{
    NewUser newUser1 = new NewUser(RandomEmail.randomUserName());
    NewUser newUser = new NewUser("Jack", "Test", "Test01", "Pdf", "Street", "Denver", "98555", "33345345454", "Green street");
    NewUser newUser2 = new NewUser(newUser1.getEmail(), newUser.getPassword());

    MainStep mainStep = new MainStep();
    AuthenticationStep authenticationStep = new AuthenticationStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    MyAccountStep myAccountStep = new MyAccountStep();
    LoginStep loginStep = new LoginStep();

    @Test(priority = 1, description = "Registration new user")
    public void shouldCanRegisterNewUser(){
        mainStep.clickOnSignInButton();
        authenticationStep.fillEmailField(newUser1);
        authenticationStep.clickCreateAnAccountButton();
        createAccountStep.fillCreateAccountForm(newUser);
        createAccountStep.chooseState();
        createAccountStep.clickRegisterButton();
        mainStep.clickOnSignOutButton();
    }

    @Test(priority = 2, description = "Login user")
    public void shouldCanLoginUser(){
        loginStep.loginUser(newUser2);
        myAccountStep.checkTextMyAccount();
        myAccountStep.checkTextMyPersonalInformation();
        myAccountStep.checkTextSignOut();
    }
}
