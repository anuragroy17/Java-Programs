package com.anurag;

import java.util.*;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desired number: ");
        boolean isNumber=sc.hasNextInt();
        if (isNumber) {
            int a = sc.nextInt();
            fibonacciSeries(a);
        }else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        sc.nextLine();
        sc.close();
    }
    public static void fibonacciSeries(int number) {
        if (number > 0) {
            long n1 = 0;
            long n2 = 1;
            System.out.print(n1 + ", " + n2);
            long n3;
            for (int i = 0; i < number; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(", " + n3);
            }
        }
    }
}
