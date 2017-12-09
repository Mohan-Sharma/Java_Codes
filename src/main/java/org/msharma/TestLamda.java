package org.msharma;

import java.util.Arrays;

/**
 * @author Mohan Sharma Created on 16/06/17.
 */
public class TestLamda {

    public void testThrowException() {
        Arrays.stream(direction.values()).forEach(e -> {
            if(e.name().equals("NORTH"))
                throw new MyException("something went wrong");
        });
    }

    public static void main(String[] args) {

        new TestLamda().testThrowException();

    }
    enum direction {
        NORTH, SOUTH, EAST, WEST;
    }
}
