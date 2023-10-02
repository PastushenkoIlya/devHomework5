package org.example;

import java.util.HashMap;

public class FibDynamic {
    //it is a utility class, so according to SonarLint it doesn't need constructors
    private FibDynamic(){}
    public static long fibonacciSequence(int posOfSeq){
        //standard case
        if(posOfSeq < 2){
            return posOfSeq;
        }
        //creating a hashMap where results of calculations will be stored
        HashMap<Integer, Long> memory = new HashMap<>();
        //checking if it has been calculated already
        if(memory.containsKey(posOfSeq)){
            return memory.get(posOfSeq);
        }
        //using recursive method
        long result = fibonacciSequence(posOfSeq-1) + fibonacciSequence(posOfSeq-2);
        //using memoization
        memory.put(posOfSeq, result);
        return result;
    }
    //time complexity -> O = n
    //memory complexity -> O = n
}
