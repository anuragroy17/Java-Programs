/* Check the equality of two arrays in java */
package com.anuragroy.interview;

import java.util.Arrays;

public class EqualityArray {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        System.out.println("======Checking Equality by Iteration======");
        equalityByIteration(arrayOne, arrayTwo);
        System.out.println("======Checking Equality by Arrays equal Method======");
        equalityByEqualMethod(arrayOne, arrayTwo);

        System.out.println("======Checking Equality by Arrays deepEquals Method if array is multidimentional======");
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        equalityByDeepEqualMethod(s1, s2);
    }

    private static void equalityByIteration(int[] arrayOne, int[] arrayTwo) {

        boolean equalOrNot = true;

        if(arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if(arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        }
        else {
            equalOrNot = false;
        }

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        }
        else {
            System.out.println("Two Arrays Are Not equal");
        }
    }

    private static void equalityByEqualMethod(int[] arrayOne, int[] arrayTwo) {
        boolean equalOrNot = Arrays.equals(arrayOne, arrayTwo);

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        }
        else {
            System.out.println("Two Arrays Are Not equal");
        }
    }

    private static void equalityByDeepEqualMethod(String[][] arrayOne, String[][] arrayTwo) {
        boolean equalOrNot = Arrays.deepEquals(arrayOne, arrayTwo);

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        }
        else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
