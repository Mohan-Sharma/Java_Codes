package org.msharma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mohan Sharma Created on 03/07/17.
 * This class demonstrates the use of regex in Java
 */
public class PatternMatcher {
    public static void main(String[] args) {
        Boolean result = Pattern.compile("(?i)^https?://.+?.something\\.[^/]+(|/[ae|bh].*|\\?.*)$").matcher("http://uat2.something.com/in/en").matches();
        System.out.println(result);
    }
}
