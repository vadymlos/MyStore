package steps.UI;

import com.codeborne.selenide.Condition;
import entity.NewUser;
import io.qameta.allure.Step;
import pages.AuthenticationPage;
import pages.MainPage;

public class AuthenticationStep {
    private AuthenticationPage authenticationPage = new AuthenticationPage();

    @Step("Fill email field for create account")
    public void fillEmailField(NewUser newUser){
        authenticationPage.getEmailForCreateAccount().setValue(newUser.getEmail());
    }

    @Step("Click the button Create an account")
    public void clickCreateAnAccountButton(){
        authenticationPage.getButtonCreateAnAccount().click();
    }

    @Step("Fill email field for Sign in")
    public void fillEmailFieldForLogin(NewUser newUser){
        authenticationPage.getEmailForLogin().setValue(newUser.getEmail());
    }
    @Step("Fill password field for Sign in")
    public void fillPasswordFieldForLogin(NewUser newUser){
        authenticationPage.getPasswordForLogin().setValue(newUser.getPassword());
    }
    @Step("Click the button Sign in")
    public void clickSignInButton(){
        authenticationPage.getButtonSignIn().click();
    }
}
