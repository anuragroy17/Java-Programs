package com.anuragroy.initial;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean check;
        check = areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(check);
        check = areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(check);
        check = areEqualByThreeDecimalPlaces(3.0,3.0);
        System.out.println(check);
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        double d1=x*1000;
        double d2=y*1000;
        int a = (int)d1;
        int b = (int)d2;
        if ( a==b){
            return true;
        }
        return false;
    }
}
