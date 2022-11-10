package com.company;

public class Calculator {

    public int divide(int a, int b) {
        if ( b == 0 ) {
            return 0;
        }

        return a/b;
    }

    public int sumArrays(int[] arr1, int[] arr2) {
        int sum = 0;

        for (int a : arr1) {
            sum += a;
        }

        for (int a : arr2) {
            sum += a;
        }

        return sum;
    }

    public int[] arrayify(int length, int start) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = start + i;
        }

        return arr;
    }
}
