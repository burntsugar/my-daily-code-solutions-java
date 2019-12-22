package com.rach.problem.thirty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Problem30Test {

    @Test
    void solve1() {
        int[] nums = {2, 1, 2};
        int expected = 1;
        assertEquals(expected, Problem30.solve(nums));
    }

    @Test
    void solve2() {
        int[] nums = {3, 0, 1, 3, 0, 5};
        int expected = 8;
        assertEquals(expected, Problem30.solve(nums));
    }

    @Test
    void solve3() {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        assertEquals(expected, Problem30.solve(nums));
    }

    @Test
    void solve4() {
        int[] nums = {0, 0, 1, 0, 3, 0};
        int expected = 1;
        assertEquals(expected, Problem30.solve(nums));
    }


}
