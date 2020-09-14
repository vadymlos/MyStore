package Retrofit;

import api.MyCookieJar;
import com.google.gson.GsonBuilder;
import entity.ItemProductInCart;
import entity.NewUser;
import entity.Product;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import utils.RandomEmail;
import utils.BasicAuthInterceptor;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class ApiRegistrationLoginAddToCartTest extends BaseRetrofitTest{

    private String cookUser;
    @BeforeMethod
    public void setUp() throws IOException {
        NewUser newUser = new NewUser(RandomEmail.randomUserName(), "Jack", "Test", "Test01", "Pdf", "Street", "Denver", "Arizona", "98555", "United State","33345345454", "Green street");

        Response<ResponseBody> response = apiStep.registerNewUser(newUser);
        assertThat(response.code(), is(200));

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor(newUser.getEmail(), newUser.getPassword()))
                .cookieJar(new MyCookieJar())
                .build();
        retrofit = new Retrofit.Builder().client(client)
                .baseUrl("http://automationpractice.com/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();
    }

    @Test(description = "Register, login and add product to cart")
    public void shouldCanLogInUserAddToProductCart() throws IOException {
        Product product = new Product("1599845889667");

        Response<ResponseBody> response = apiStep.addProductToCartForLogInUser(product, cookUser);
        assertThat(response.code(), is(200));

        Response <ItemProductInCart> response2 = apiStep.checkQuantityOfProductsInCart();
        assertThat(response2.code(), is(200));
//        assertThat(response2.body().get(0).getQuantity(), notNullValue());
    }
}
