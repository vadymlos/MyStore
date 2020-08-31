package utils;

import java.util.Date;

public class RandomName {
    public static String randomUserName(){
        return "Vadym" + new Date().getTime();
    }
}
