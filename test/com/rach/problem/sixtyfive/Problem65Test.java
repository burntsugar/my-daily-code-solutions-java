package com.rach.problem.sixtyfive;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Problem65Test {

    @Test
    void whenArrayReturnsInSpiral_thenAssertionSucceeds() {
        int arr[][] = {{1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        int[] expected = {1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12};
        assertArrayEquals(expected, Problem65.solve(arr), () -> "expected should be " + expected);
    }
}
