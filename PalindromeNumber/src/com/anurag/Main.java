package com.anurag;

public class Main {
    public static void main(String[] args) {
        boolean a= isPalindrome(-5555);
        System.out.println(a);
    }
    public static boolean isPalindrome(int number) {
        int reverse=0;
        int original = number;
        while (number!=0) {
            reverse = reverse*10 + number % 10;
            number = number/10;
        }
        if (original == reverse){
            return true;
        }else
            return false;
    }
}

