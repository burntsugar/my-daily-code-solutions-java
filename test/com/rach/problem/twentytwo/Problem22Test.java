package com.rach.problem.twentytwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class Problem22Test {

    @Test
    void solve1() {
        String arr[] = {"quick", "brown", "the", "fox"};
        String expected[] = {"the", "quick", "brown", "fox"};
        String strOfWords = "thequickbrownfox";
        assertArrayEquals(expected,Problem22.solve(arr, strOfWords));
    }

    @Test
    void solve2() {
        String arr[] = {"bed", "bath", "bedbath", "and", "beyond"};
        String expected[] = {"bed", "bath", "and", "beyond"};
        String strOfWords = "bedbathandbeyond";
        assertArrayEquals(expected,Problem22.solve(arr, strOfWords));
    }

}
