package UI;

import entity.NewUser;
import org.testng.annotations.Test;
import steps.UI.AuthenticationStep;
import steps.UI.CreateAccountStep;
import steps.UI.MainStep;
import steps.UI.MyAccountStep;
import utils.RandomEmail;

public class RegistrationTest extends BaseTest{
    NewUser newUser1 = new NewUser(RandomEmail.randomUserName());
    NewUser newUser = new NewUser("Jack", "Test", "Test01", "Pdf", "Street", "Denver", "98555", "33345345454", "Green street");

    MainStep mainStep = new MainStep();
    AuthenticationStep authenticationStep = new AuthenticationStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    MyAccountStep myAccountStep = new MyAccountStep();

    @Test(description = "Registration new user")
    public void shouldCanRegisterNewUser(){
        mainStep.clickOnSignInButton();
        authenticationStep.fillEmailField(newUser1);
        authenticationStep.clickCreateAnAccountButton();
        createAccountStep.fillCreateAccountForm(newUser);
        createAccountStep.chooseState();
        createAccountStep.chooseCountry();
        createAccountStep.clickRegisterButton();
        myAccountStep.checkTextMyAccount();
        myAccountStep.checkTextMyPersonalInformation();
        myAccountStep.checkTextSignOut();
    }
}
