package com.anuragroy.initial;

public class FirstLastDigitSum {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {

        int sum = sumFirstAndLastDigit(124);
        if (sum == -1) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            System.out.println("Sum of first and last digit:- " + sum);
        }
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number > 0) {
            if (number / 10 != 0) {
                number = number / 10;
                continue;
            }
            break;
        }
        int firstDigit = number;
        int sum = lastDigit + firstDigit;
        return sum;
    }
}
