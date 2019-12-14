package com.rach.problem.four;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ProblemFourCheatTest {
    @Test
    public void testOne(){
        int arr[] = {0, 10, 2, -10, -20};
        int expected = 1;
        assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testTwo(){
        int arr[] = {0, 10, 2, -10, -20, 1, 3, 4};
        int expected = 5;
        assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testThree(){
        int arr[] = {0, 0, 10, 2, -10, -20, 1, 3, 4};
        int expected = 5;
        assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testFour(){
        int arr[] = {-1, 0, 0, 1, 2, 4};
        int expected = 3;
        assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testFive(){
        int arr[] = {};
        int expected = 0;
        assertEquals(expected,ProblemFourCheat.cheat(arr));
    }
}
