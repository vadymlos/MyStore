package steps.UI;

import entity.NewUser;
import io.qameta.allure.Step;
import pages.AuthenticationPage;

public class LoginStep {
    AuthenticationPage authenticationPage = new AuthenticationPage();

    @Step("Fill email and password fields")
    public void loginUser(NewUser newUser){
        authenticationPage.getEmailForLogin().setValue(newUser.getEmail());
        authenticationPage.getPasswordForLogin().setValue(newUser.getPassword());
        authenticationPage.getButtonSignIn().click();
    }
}
