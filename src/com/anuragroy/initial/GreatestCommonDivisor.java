package com.anuragroy.initial;

public class GreatestCommonDivisor {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        int a=getGreatestCommonDivisor(25,15);
        System.out.println(a);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first>=10 && second>=10) {
            int greatestCommonDivisor=0;
            for (int i=1; i<=first && i<=second;i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestCommonDivisor = i;
                }
            }
            return greatestCommonDivisor;
        }
        return -1;
    }
}
