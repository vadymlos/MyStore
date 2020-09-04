package steps;

import com.codeborne.selenide.Condition;
import entity.NewUser;
import io.qameta.allure.Step;
import pages.AuthenticationPage;
import pages.MainPage;

public class AuthenticationStep {
    private AuthenticationPage authenticationPage = new AuthenticationPage();

    @Step("Fill email field")
    public void fillEmailField(NewUser newUser){
        authenticationPage.getEmailForCreateAccount().setValue(newUser.getEmail());
    }

    @Step("Click the button Create an account")
    public void clickCreateAnAccountButton(){
        authenticationPage.getButtonCreateAnAccount().click();
    }
}
