package com.lryg.s20260724;

import java.util.Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10;
        int[] fibonacciSequence = new int[n];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        System.out.println(Arrays.toString(fibonacciSequence));
    }
}
