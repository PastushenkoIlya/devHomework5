package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibRecursiveTest {
    @Test
    void IsSixthPosOfSeqEqualsEight(){
        assertEquals(8, FibRecursive.fibonacciSequence(6));
    }
}