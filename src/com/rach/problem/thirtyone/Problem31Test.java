package com.rach.problem.thirtyone;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Problem31Test {

    @Test
    void solve1(){
        String oldString = "sitting";
        String newString = "kitten";
        int expected = 3;
        assertEquals(expected,Problem31.solve(oldString, newString));
    }

    @Test
    void solve2(){
        String oldString = "climate";
        String newString = "Climate Change";
        int expected = 8;
        assertEquals(expected,Problem31.solve(oldString, newString));
    }

    @Test
    void solve3(){
        String oldString = "the Swedish chef";
        String newString = "The Swedish Chef";
        int expected = 2;
        assertEquals(expected,Problem31.solve(oldString, newString));
    }

    @Test
    void solve4(){
        String oldString = "the Swedish chef";
        String newString = "The Swedish Chef and the lobster!";
        int expected = 19;
        assertEquals(expected,Problem31.solve(oldString, newString));
    }
}
