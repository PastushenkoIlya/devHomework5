package org.example;

public class FibIteration {
    //it is a utility class, so according to SonarLint it doesn't need constructors
    private FibIteration(){

    }
    public static long fibonacciSequence(int posOfSeq){   // position of sequence
        if (posOfSeq <= 0) return posOfSeq;
        int last = 1;
        int preLast = 0;
        int result = 1;
        while (posOfSeq > 1){
            result = last + preLast;
            preLast = last;
            last = result;
            posOfSeq--;
        }
        return result;
    }

    //time complexity -> O = n  *linear
    //memory complexity -> O = n   *linear
}
