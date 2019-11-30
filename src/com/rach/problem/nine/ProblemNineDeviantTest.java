package com.rach.problem.nine;

import org.junit.Assert;
import org.junit.Test;

public class ProblemNineDeviantTest {

    @Test
    public void testOne(){
        //int[] arr = {2, 2, 2, 6, 2, 5, 7, 1, 8, 1, 1, 1, 1, 2};
        int[] arr = {2, 4, 6, 2, 5};
        int expected = 13;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }
    @Test
    public void testTwo(){
        int[] arr = {2, 2, 2, 6, 2, 5, 7, 1, 8, 1, 1, 1, 1, 2};
        int expected = 20;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }
    @Test
    public void testThree(){
        int[] arr = {1,1,17,10,12,5,3,18,16};
        int expected = 34;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testFour(){
        int[] arr = {10,20,2,2,1,1};
        int expected = 13;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testFive(){
        int[] arr = {10,20,2,2,1,1,0};
        int expected = 13;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testSix(){
        int[] arr = {1,1,1,1,1};
        int expected = 1;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testSeven(){
        int[] arr = {4,1,2,2,3};
        int expected = 6;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testEight(){
        int[] arr = {0,1,2,5,3};
        int expected = 5;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testNine(){
        int[] arr = {0,1,2,2,3};
        int expected = 2;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testTen(){
        int[] arr = {0,1,-2,2,3};
        int expected = 1;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

    @Test
    public void testEleven(){
        int[] arr = {1,2,2,3,-10};
        int expected = -7;
        Assert.assertEquals(expected, ProblemNineDeviant.solve(arr));
    }

}
