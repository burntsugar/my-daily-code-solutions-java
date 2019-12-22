package com.rach.problem.nine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;


public class ProblemNineTest {

    @Test
    public void testOne(){
        int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        int expected = 110;

        assertEquals(expected,ProblemNine.solve(arr));
    }

    @Test
    public void testTwo(){
        int arr[] = new int[]{5, 50, 10, 100, 10, 5};
        int expected = 155;
        assertEquals(expected,ProblemNine.solve(arr));
    }

    @Test
    public void testThree(){
        int arr[] = new int[]{5, -50, 10, 100, 10, 5};
        int expected = 110;
        assertEquals(expected,ProblemNine.solve(arr));
    }
}
