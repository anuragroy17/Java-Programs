package com.anuragroy.initial;

public class MinutesToYearDaysCalculator {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long year = (hours / 24) / 365;
            long days = (hours / 24) % 365;
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
