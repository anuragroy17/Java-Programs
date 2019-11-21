package com.anuragroy.interview;

import java.util.Stack;

public class ReverseString {
    public static void main(String args[]){
        String str = "MyJava";
        System.out.println("Original String: " + str);
        reverseByInBuiltMethod(str);
        reverseByIteration(str);
        reverseByStack(str);
        System.out.println("Reverse By Recursion: "+reverseByRecursion(str));
    }

    private static void reverseByInBuiltMethod(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse By reverse() method: " + sb.reverse());
    }

    private static void reverseByIteration(String str){
        char [] chars = str.toCharArray();
        System.out.print("Reverse By iterating: ");
        for(int i=chars.length-1; i>=0; i--)
            System.out.print(chars[i]);
        System.out.println();
    }

    private static void reverseByStack(String str){
        Stack<Character> tempStack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            tempStack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!tempStack.isEmpty()){
            sb.append(tempStack.pop());
        }
        System.out.println("Reverse By Stack: " + sb.toString());
    }


    private static String reverseByRecursion(String str){
        if(str == null || str.length()<=1){
            return str;
        }
        return reverseByRecursion(str.substring(1)) + str.charAt(0);
    }

    /* Explanation for recursion:
        1st Call —>   recursiveMethod(“MyJava”)
        2nd Call —>   recursiveMethod(“yJava”) + “M”
        3rd Call —>   recursiveMethod(“Java”) + “y”) + “M”
        4th call —>   recursiveMethod(“ava”) + “J”)+”y”) + “M”
        5th Call —>   recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M”
        6th Call —>   recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”
        After 6th call, it Stops calling itself. Because the length of passed string is 1. So, finally it returns “avaJyM”
     */
}
