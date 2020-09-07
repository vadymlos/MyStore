package UI;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import driver.SelenoidDriverProvider;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeClass
    public void BeforeMethod(){
        Configuration.baseUrl = "http://automationpractice.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browser = SelenoidDriverProvider.class.getName();
        Configuration.fastSetValue = true;
        Configuration.driverManagerEnabled = false;
        open("/index.php");
//        RestAssured.port = 80;
    }
}
