package steps;
import com.codeborne.selenide.Condition;
import entity.NewUser;
import io.qameta.allure.Step;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;

public class CreateAccountStep {
    private CreateAccountPage createAccountPage = new CreateAccountPage();

    @Step("Fill create account form")
    public void fillCreateAccountForm(NewUser newUser){
        createAccountPage.getCustomerFirstName().setValue(newUser.getFirstName());
        createAccountPage.getCustomerLastName().setValue(newUser.getLastName());
        createAccountPage.getCustomerPassword().setValue(newUser.getPassword());
        createAccountPage.getCustomerCompany().setValue(newUser.getCompany());
        createAccountPage.getCustomerAddress().setValue(newUser.getAddress());
        createAccountPage.getCustomerCity().setValue(newUser.getCity());
        createAccountPage.getCustomerState().setValue(newUser.getState());
        createAccountPage.getCustomerZip().setValue(newUser.getZip());
        createAccountPage.getCustomerCountry().setValue(newUser.getCountry());
        createAccountPage.getCustomerMobilePhone().setValue(newUser.getMobPhone());
        createAccountPage.getCustomerAddressAlias().setValue(newUser.getAddressAlias());
    }

    @Step("Click the button Register")
    public void clickRegisterButton(){
        createAccountPage.getCustomerRegisterButton().click();
    }
}
