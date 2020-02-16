package com.rach.problem.thirtyfive;

import com.rach.problem.thirtyone.Problem31;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Problem35Test {

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class Array_Is_Sorted_R_G_B {

        @Test
        void whenArrayReturnsSortedRGBOrder_thenAssertionSucceeds() {
            char[] arr = {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
            char[] expected = {'R', 'R', 'R', 'G', 'G', 'B', 'B'};
            assertArrayEquals(expected, Problem35.solve(arr), () -> "expected should be " + expected);
        }

        @Test
        public void whenIllegalArgumentExceptionThrown_thenAssertionSucceeds() {
            char[] arr = {'X','B','G','G','R','R','R'};
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                Problem35.solve(arr);
            });
            String expectedMessage = "Illegal character!";
            String actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }


    }
}
