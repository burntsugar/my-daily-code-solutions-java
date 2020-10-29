package com.rach.problem.three19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProblemThree19Test {

    @Test
    public void testOne(){
        int expected[][] = {{1,2,3},{4,5,6},{7,8,0}};
        assertArrayEquals(expected,Problem319.solve());
    }

}
