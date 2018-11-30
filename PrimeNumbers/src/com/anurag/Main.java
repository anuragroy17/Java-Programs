package com.anurag;

import java.util.*;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        boolean isNumber = sc.hasNextLong();

        if (isNumber) {

            long start = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter the end number: ");
            long end = sc.nextLong();
            sc.nextLine();


            if (start >= 0 && end >= 0) {
                int count=0;
                if (start < end) {

                    System.out.println("Prime numbers between " + start + " and " + end + " are: ");
                    for (long i = start; i <= end; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                            count++;
                        }
                    } if (count==0){
                        System.out.println("There are no prime numbers present in between the series");
                    }

                } else if (end < start) {

                    System.out.println("Prime numbers between " + start + " and " + end + " are: ");
                    for (long j = end; j <= start; j++) {
                        if (isPrime(j)) {
                            System.out.print(j + " ");
                        }
                    } if (count==0){
                        System.out.println("There are no prime numbers present in between the series");
                    }

                } else if (end == start) {

                    System.out.println("End Number is equal to Start Number.");
                    if(isPrime(start)){
                        System.out.println("So the prime Number is "+start);
                    }else {
                        System.out.println("There is no prime number present");
                    }
                }

            } else {

                System.out.println("The entered number is negative");
            }

        } else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        sc.close();
    }


    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
