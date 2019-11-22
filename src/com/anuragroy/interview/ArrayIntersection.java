/*
    Write a java program to find common elements between two arrays?
    OR
    Write a java program to find intersection of two arrays?
 */
package com.anuragroy.interview;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        System.out.println("======BY Iteration======");
        byIteration(s1, s2);
        System.out.println();
        System.out.println("======BY Retaining======");
        byRetaining(s1, s2);
    }

    public static void byIteration(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);
    }

    public static void byRetaining(String[] s1, String[] s2) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
