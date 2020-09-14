package Retrofit;

import entity.NewUser;
import entity.ResponseBodyUser;
import okhttp3.ResponseBody;
import org.testng.annotations.Test;
import retrofit2.Response;
import utils.RandomEmail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

public class ApiRegistrationTest extends BaseRetrofitTest{

    @Test(description = "Register new user")
    public void shouldCanRegisterNewUser() throws IOException {
        Response<ResponseBody> response = apiStep.registerNewUser(new NewUser(RandomEmail.randomUserName(), "Jack", "Test", "Test01", "Pdf", "Street", "Denver", "Arizona", "98555", "United State","33345345454", "Green street"));
        assertThat(response.code(), is(200));
        String ff = response.raw().toString();
        System.out.println(ff);
    }
}
