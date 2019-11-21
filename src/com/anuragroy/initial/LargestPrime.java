package com.anuragroy.initial;

public class LargestPrime {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        int n = getLargestPrime(21);
        System.out.println(n);
    }

    public static int getLargestPrime(int number) {
        if (number > 1) {
            int largestPrime = number;
            boolean primeDivisor = false;
            int halfNum = number / 2;
            for (int i = halfNum; i > 2; i--) {
                if (number % i == 0) {
                    primeDivisor = true;
                    int halfDivisor = i / 2;
                    for (int j = halfDivisor; j > 2; j--) {
                        if (i % j == 0) {
                            primeDivisor = false;
                            break;
                        }
                    }
                }
                if (primeDivisor) {
                    largestPrime = i;
                    break;
                }
            }
            return largestPrime;
        }
        return -1;
    }
}
