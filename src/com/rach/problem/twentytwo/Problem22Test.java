package com.rach.problem.twentytwo;

import org.junit.Assert;
import org.junit.Test;

public class Problem22Test {
//    @Test
//    public void Test1(){
//        String arr[] = {"quick", "brown", "the", "fox"};
//        String expected[] = {"the", "quick", "brown", "fox"};
//        String strOfWords = "thequickbrownfox";
//        Assert.assertEquals(expected,Problem22.solve1(arr, strOfWords));
//    }

    @Test
    public void Test1(){
        String arr[] = {"quick", "brown", "the", "fox"};
        String expected[] = {"the", "quick", "brown", "fox"};
        String strOfWords = "thequickbrownfox";
        Assert.assertEquals(expected,Problem22.solve2(arr, strOfWords));
    }
}
