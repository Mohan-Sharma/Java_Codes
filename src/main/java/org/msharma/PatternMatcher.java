package org.msharma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mohan Sharma Created on 03/07/17.
 */
public class PatternMatcher {
    public static void main(String[] args) {
        Boolean result = Pattern.compile("(?i)^https?://.+?.maxfashion\\.[^/]+(|/[ae|bh].*|\\?.*)$").matcher("http://uat2.maxfashion.com/in/en").matches();
        System.out.println(result);
    }
}
