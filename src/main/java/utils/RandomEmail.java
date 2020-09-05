package utils;

import java.util.Date;

public class RandomEmail {
    public static String randomUserName(){
        return "Work" + new Date().getTime();
    }
}
