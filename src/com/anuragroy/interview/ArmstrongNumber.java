package com.anuragroy.interview;

public class ArmstrongNumber {

    public static void main(String[] args) {
        checkArmstrongNumber(153);
    }

    public static void checkArmstrongNumber(int number) {
        int copyOfNumber = number;
        int sum = 0;

        while (copyOfNumber != 0) {
            int lastDigit = copyOfNumber % 10;
            int temp =  lastDigit * lastDigit * lastDigit;
            sum += temp;
            copyOfNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
    }
}
