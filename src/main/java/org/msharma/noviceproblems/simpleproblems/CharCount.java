package org.msharma.noviceproblems.simpleproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * This Example demonstrates how to count the number of repeating characters.
 */
class CharCount
{
    public static void main(String arr[])
    {
        String input = "adhjashdjadjasff";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if (map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
            else
            {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " counts " +entry.getValue() + "times");
        }
    }

}