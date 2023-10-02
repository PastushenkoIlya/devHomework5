package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibDynamicTest {
    @Test
    void IsSixthPosOfSeqEqualsEight(){
        assertEquals(8, FibDynamic.fibonacciSequence(6));
    }
}