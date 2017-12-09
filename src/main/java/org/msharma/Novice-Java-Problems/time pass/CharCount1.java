 import java.util.*;
import java.lang.*;
class CharCount1
{
public static void main(String arg[])
{   String str = "sdakjsafasdjdfhd";
    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    char[] arr = str.toCharArray();

    for (char value: arr) {

       if (Character.isLetter(value)) {
           if (charMap.containsKey(value)) {
               charMap.put(value, charMap.get(value) + 1);

           } else {
               charMap.put(value, 1);
           }
       }
    }

    System.out.println(charMap);
}
}