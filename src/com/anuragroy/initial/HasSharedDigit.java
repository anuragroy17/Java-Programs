package com.anuragroy.initial;

public class HasSharedDigit {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        boolean result = sharedDigit(22, 22);
        System.out.println(result);
    }

    public static boolean sharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        if ((firstNumber == secondNumber) ||
                (firstNumber % 10 == secondNumber / 10) ||
                (firstNumber % 10 == secondNumber % 10) ||
                (firstNumber / 10 == secondNumber / 10) ||
                (firstNumber / 10 == secondNumber % 10)) {
            return true;
        }
        return false;
    }
}
