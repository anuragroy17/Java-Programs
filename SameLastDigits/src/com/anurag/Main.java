package com.anurag;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        boolean result = hasSameLastDigit(22, 25, 42);
        System.out.println(result);
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < 10 || firstNumber > 1000 || secondNumber < 10 || secondNumber > 1000 || thirdNumber < 0 || thirdNumber > 1000) {
            return false;
        }

        if ((firstNumber % 10 == secondNumber % 10) || (secondNumber % 10 == thirdNumber % 10) || (firstNumber % 10 == thirdNumber % 10)) {
            return true;
        }
        return false;
    }
}