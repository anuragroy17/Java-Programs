/* Write a Java program to check whether two strings are anagram or not */
package com.anuragroy.interview;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        System.out.println("======By Methods======");
        isAnagramByMethods("Keep", "Peek");
        isAnagramByMethods("Mother In Law", "Hitler Woman");

        System.out.println();
        System.out.println("======By Iteration======");
        isAnagramByIteration("Keep", "Peek");
        isAnagramByIteration("Mother In Law", "Hitler Woman");
    }

    public static void isAnagramByMethods(String str1, String str2) {
        //Removing white spaces from s1 and s2 and changing case to lower
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        //Initially setting status as true
        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;
        } else {
            //converting to lowercase
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            //sorting array in ascending
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            //checking equality
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    static void isAnagramByIteration(String s1, String s2) {
        //Removing white spaces from s1 and s2 and changing case to lower
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        //Initially setting status as true
        boolean status = true;

        if(copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
            status = false;
        }
        else {
            //Converting copyOfs1 to char array
            char[] s1ToArray = copyOfs1.toCharArray();
            //Checking whether each character of s1ToArray is present in copyOfs2
            for (char c : s1ToArray) {
                int index = copyOfs2.indexOf(c); //returns index of 1st char if there are duplicates
                if(index != -1) {
                    //If character is present in copyOfs2, removing that char from copyOfs2 (required as duplicate characters maybe present)
                    copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
                }
                else {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop
                    status = false;
                    break;
                }
            }
        }

        //Output
        if(status) {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
}
