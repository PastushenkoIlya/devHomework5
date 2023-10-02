package org.example;

public class FibRecursive {
    //it is a utility class, so according to SonarLint it doesn't need constructors
    private FibRecursive(){

    }
    public static long fibonacciSequence(int posOfSeq) {
        if (posOfSeq < 2 ) return posOfSeq;
        return fibonacciSequence(posOfSeq-1) + fibonacciSequence(posOfSeq-2);
    }

    //time complexity -> O = n^2   *squared
    //memory complexity -> O = n   *linear, but can reach stack overflow exception
}
