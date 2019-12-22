package com.rach.problem.twentynine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem29Test {

    @Test
    void solve1(){
        String str = "AAAABBBCCDAA";
        String expected = "4A3B2C1D2A";
        assertTrue(expected.equals(Problem29.solve(str)));
    }

    @Test
    void solve2(){
        String str = "zzawww";
        String expected = "2z1a3w";
        assertTrue(expected.equals(Problem29.solve(str)));
    }

    @Test
    void solve3(){
        String str = "zzawww  ";
        String expected = "2z1a3w2 ";
        assertTrue(expected.equals(Problem29.solve(str)));
    }
}
