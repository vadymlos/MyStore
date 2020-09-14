package api;

import entity.ItemProductInCart;
import entity.NewUser;
import entity.Product;
import entity.ResponseBodyUser;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface UserService {
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("?controller=authentication")
    Call<ResponseBody> registerNewUser(@Body NewUser newUser);

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @GET("?controller=my-account")
    Call<ResponseBody> loginUser(@Query("username") String userName, @Query("password") String password);

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("?rand=1599845889667")
    Call<ResponseBody> addProductToCart(@Body Product product);

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("?rand=1599845889667")
    Call<ResponseBody> addProductToCartForLogInUser(@Body Product product, @Header("Cookie") String cookie);

    @GET("?controller=order")
    Call<List<ItemProductInCart>> checkQuantityOfProductInOrder();
}
