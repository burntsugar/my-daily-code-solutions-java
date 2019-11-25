package com.rach.problem.four;

import org.junit.Assert;
import org.junit.Test;

public class ProblemFourCheatTest {
    @Test
    public void testOne(){
        int arr[] = {0, 10, 2, -10, -20};
        int expected = 1;
        Assert.assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testTwo(){
        int arr[] = {0, 10, 2, -10, -20, 1, 3, 4};
        int expected = 5;
        Assert.assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testThree(){
        int arr[] = {0, 0, 10, 2, -10, -20, 1, 3, 4};
        int expected = 5;
        Assert.assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testFour(){
        int arr[] = {-1, 0, 0, 1, 2, 4};
        int expected = 3;
        Assert.assertEquals(expected,ProblemFourCheat.cheat(arr));
    }

    @Test
    public void testFive(){
        int arr[] = {};
        int expected = 0;
        Assert.assertEquals(expected,ProblemFourCheat.cheat(arr));
    }
}
