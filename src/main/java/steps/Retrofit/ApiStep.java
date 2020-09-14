package steps.Retrofit;

import api.UserService;
import entity.ItemProductInCart;
import entity.NewUser;
import entity.Product;
import entity.ResponseBodyUser;
import io.qameta.allure.Step;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class ApiStep {
    private Retrofit retrofit;

    public ApiStep(Retrofit retrofit){

        this.retrofit = retrofit;
    }

    @Step("Register new user")
    public Response<ResponseBody> registerNewUser(NewUser newUser) throws IOException {
        return retrofit.create(UserService.class).registerNewUser(newUser).execute();
    }

    @Step("Login user")
    public Response<ResponseBody> loginUser (String email, String password) throws IOException {
        return retrofit.create(UserService.class).loginUser(email, password).execute();
    }

    @Step("Add product to cart for log out user")
    public Response<ResponseBody> addProductToCart (Product product) throws IOException {
        return retrofit.create(UserService.class).addProductToCart(product).execute();
    }

    @Step("Add product to cart for log in user")
    public Response<ResponseBody> addProductToCartForLogInUser (Product product, String cookie) throws IOException {
        return retrofit.create(UserService.class).addProductToCartForLogInUser(product, cookie).execute();
    }

    @Step("Check order quantity")
    public Response<List<ItemProductInCart>> checkQuantityOfProductsInCart() throws IOException {
        return retrofit.create(UserService.class).checkQuantityOfProductInOrder().execute();
    }

}
