package Retrofit;

import com.codeborne.selenide.Configuration;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import org.testng.annotations.BeforeMethod;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import steps.Retrofit.ApiStep;

public class BaseRetrofitTest {
    Retrofit retrofit;
    ApiStep apiStep;

    @BeforeMethod
    public void BeforeMethod(){
//        Configuration.baseUrl = "http://172.32.64.34";
//        Configuration.holdBrowserOpen = true;
////        Configuration.browser = "chrome";  //    SelenoidDriverProvider.class.getName();
//        Configuration.fastSetValue = true;
//        Configuration.driverManagerEnabled = true;

//        OkHttpClient client = new OkHttpClient.Builder()
//                .cookieJar(new MyCookieJar())
//                .build();
        retrofit = new Retrofit.Builder()//.client(client)
                .baseUrl("http://automationpractice.com/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();
        apiStep = new ApiStep(retrofit);
    }
}
