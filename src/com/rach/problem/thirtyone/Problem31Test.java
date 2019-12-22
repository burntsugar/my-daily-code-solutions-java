package com.rach.problem.thirtyone;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem31Test {

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class Edit_distance_is_calculated {

        @Test
        @DisplayName("Edit distance between 'sitting' and 'kitten' is 3")
        void solve1() {
            String oldString = "sitting";
            String newString = "kitten";
            int expected = 3;
            assertEquals(expected, Problem31.solve(oldString, newString));
        }

        @Test
        @DisplayName("Edit distance between 'climate' and 'Climate Change' is 8")
        void solve2() {
            String oldString = "climate";
            String newString = "Climate Change";
            int expected = 8;
            assertEquals(expected, Problem31.solve(oldString, newString));
        }

        @Test
        @DisplayName("Edit distance between 'the Swedish chef' and 'The Swedish Chef' is 2")
        void solve3() {
            String oldString = "the Swedish chef";
            String newString = "The Swedish Chef";
            int expected = 2;
            assertEquals(expected, Problem31.solve(oldString, newString));
        }

        @Test
        @DisplayName("Edit distance between 'the Swedish chef' and 'The Swedish Chef and the lobster!' is 19")
        void solve4() {
            String oldString = "the Swedish chef";
            String newString = "The Swedish Chef and the lobster!";
            int expected = 19;
            assertEquals(expected, Problem31.solve(oldString, newString));
        }
    }

}
