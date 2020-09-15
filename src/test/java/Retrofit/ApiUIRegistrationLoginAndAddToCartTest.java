package Retrofit;

import api.MyCookieJar;
import com.google.gson.GsonBuilder;
import entity.NewUser;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import steps.Retrofit.ApiStep;
import steps.UI.CartStep;
import steps.UI.CatalogWomenStep;
import steps.UI.MainStep;
import steps.UI.PopUpCartStep;
import utils.BasicAuthInterceptor;
import utils.RandomEmail;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ApiUIRegistrationLoginAndAddToCartTest extends BaseRetrofitTest{

    MainStep mainStep = new MainStep();
    CatalogWomenStep catalogWomenStep = new CatalogWomenStep();
    PopUpCartStep popUpCartStep = new PopUpCartStep();
    CartStep cartStep = new CartStep();

    @BeforeMethod
    public void setUp() throws IOException{
        NewUser newUser = new NewUser(RandomEmail.randomUserName(), "Jack", "Test", "Test01", "Pdf", "Street", "Denver", "Arizona", "98555", "United State","33345345454", "Green street");

        Response<ResponseBody> response = apiStep.registerNewUser(newUser);
        assertThat(response.code(), is(200));
        String cookieSet = response.headers().get("Cookie");

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor(newUser.getEmail(), newUser.getPassword()))
                .cookieJar(new MyCookieJar())
                .build();
        retrofit = new Retrofit.Builder().client(client)
                .baseUrl("http://automationpractice.com/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();

        open("/index.php");
        apiStep = new ApiStep(retrofit);
//        mainStep.setUserCookie(mainStep.setUserCookie(cookieSet);
    }

    @Test(description = "Add product to cart")
    public void shouldCanAddProductToCart(){
        mainStep.clickBlockOfCatalogWomen();
        catalogWomenStep.hoverOnProduct();
        catalogWomenStep.clickTheButtonAddToCart();
        popUpCartStep.clickButtonProceedToCheckout();
        cartStep.checkProductInCart();
        cartStep.checkAvailableInStock();
    }
}
