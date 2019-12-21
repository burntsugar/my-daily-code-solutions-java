package com.rach.problem.twentynine;

import static org.junit.jupiter.api.Assertions.*;

public class Problem29Test {

    @org.junit.jupiter.api.Test
    void solve1(){
        String str = "AAAABBBCCDAA";
        String expected = "4A3B2C1D2A";
        assertTrue(expected.equals(Problem29.solve(str)));
    }

    @org.junit.jupiter.api.Test
    void solve2(){
        String str = "zzawww";
        String expected = "2z1a3w";
        assertTrue(expected.equals(Problem29.solve(str)));
    }

    @org.junit.jupiter.api.Test
    void solve3(){
        String str = "zzawww  ";
        String expected = "2z1a3w2 ";
        assertTrue(expected.equals(Problem29.solve(str)));
    }
}
