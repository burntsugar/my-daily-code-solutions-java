package com.rach.problem.four;

import org.junit.Assert;
import org.junit.Test;

public class ProblemFourTest {
    @Test
    public void testOne(){
        int arr[] = { 0, 10, 2, -10, -20 };
        int arr_size = arr.length;
        int expected = 1;
        Assert.assertEquals(expected,ProblemFour.start(arr,arr_size));
    }
    @Test
    public void testTwo(){
        int arr[] = { 0, 10, 2, -10, -20, -1, 1 };
        int arr_size = arr.length;
        int expected = 3;
        Assert.assertEquals(expected,ProblemFour.start(arr,arr_size));
    }
    @Test
    public void testThree(){
        int arr[] = { -1, -2, -3, 1, 2 };
        int arr_size = arr.length;
        int expected = 3;
        Assert.assertEquals(expected,ProblemFour.start(arr,arr_size));
    }
    @Test
    public void testFour(){
        int arr[] = {};
        int arr_size = arr.length;
        int expected = 1;
        Assert.assertEquals(expected,ProblemFour.start(arr,arr_size));
    }

}
