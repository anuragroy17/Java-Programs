package com.anuragroy.interview;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        System.out.println("Second Largest By Iteration: "+secondLargestByIteration(new int[]{45, 51, 28, 75, 49, 42}));
        System.out.println("Second Largest By Sorting: "+secondLargestBySort(new int[]{45, 51, 28, 75, 49, 42}));
    }

    public static int secondLargestByIteration(int[] input) {
        int firstLargest, secondLargest;

        if (input[0] > input[1]) {
            firstLargest = input[0];
            secondLargest = input[1];
        } else {
            firstLargest = input[1];
            secondLargest = input[0];
        }

        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = input[i];
            } else if (input[i] < firstLargest && input[i] > secondLargest) {
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }

    private static int secondLargestBySort(int[] input) {
        Arrays.sort(input);
        return input[input.length - 2];
    }
}
