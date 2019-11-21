package com.anuragroy.initial;

public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean isLY;
        isLY = isLeapYear(-1600);
        System.out.println("Is the year a leap year? ans: " + isLY);
        isLY = isLeapYear(1600);
        System.out.println("Is the year a leap year? ans: " + isLY);
        isLY = isLeapYear(2017);
        System.out.println("Is the year a leap year? ans: " + isLY);
        isLY = isLeapYear(2000);
        System.out.println("Is the year a leap year? ans: " + isLY);
    }
    public static boolean isLeapYear(int year) {
        boolean ans = false;
        if (year >=1 && year<=9999) {
            if((year%4==0 && year%100 != 0) || year%400==0) {
                ans = true;
                return ans;
            }
        }
        return ans;
    }
}
