package Retrofit;

import entity.Product;
import okhttp3.ResponseBody;
import org.testng.annotations.Test;
import retrofit2.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

public class ApiAddToCartTest extends BaseRetrofitTest{

    @Test(description = "Log out user add product to car")
    public void shouldCanAddProductToCart() throws IOException {
        Product product = new Product("1599845889667");

        Response<ResponseBody> response = apiStep.addProductToCart(product);
        assertThat(response.code(), is(200));
        String fff = response.body().toString();
        System.out.println(fff);
    }
}
