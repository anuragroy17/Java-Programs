package com.anurag;

import java.util.*;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");

        boolean isNumber = sc.hasNextInt();
        if(isNumber) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("The number is prime.");
            } else {
                System.out.println("The number is not prime.");
            }
        }else{
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        sc.nextLine();
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

