package org.msharma;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    String str = StringUtils.EMPTY;
    public static void main( String[] args )
    {
        for(int i=1; i<5; i++)
        {
            System.out.println("i: "+i);
            for(int j=1; j<5; j++)
            {
                if(j == 1)
                    continue;
                System.out.println("j: " + j);
            }
        }
    }

    public static void test(String str) {
        if(str.equals("EAST") || str.equals("WEST")) {
            System.out.println("Direction");
        }
        else if (str.equals("WEST")) {
            System.out.println("Direction");
        }
        Arrays.stream(direction.values()).map(e -> e.name()).collect(Collectors.toList());
    }

    enum direction {
        NORTH, SOUTH, EAST, WEST;
    }
}
