package utils;

import java.util.Date;

public class RandomEmail {
    public static String randomUserName(){
        return new Date().getTime() + "@com.com";
    }
}
