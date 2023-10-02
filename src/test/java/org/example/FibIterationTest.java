package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibIterationTest {
    @Test
    void IsSixthPosOfSeqEqualsEight(){
        assertEquals(8, FibIteration.fibonacciSequence(6));
    }

}