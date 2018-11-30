package com.anurag;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {

        double areaObtained=area(5.0);
        if(areaObtained==-1) System.out.println(INVALID_VALUE_MESSAGE);
        else
            System.out.println(areaObtained);

        areaObtained=area(-1);
        if(areaObtained==-1) System.out.println(INVALID_VALUE_MESSAGE);
        else
            System.out.println(areaObtained);

        areaObtained=area(5.0,4.0);
        if(areaObtained==-1) System.out.println(INVALID_VALUE_MESSAGE);
        else
            System.out.println(areaObtained);

        areaObtained=area(-1.0,4.0);
        if(areaObtained==-1) System.out.println(INVALID_VALUE_MESSAGE);
        else
            System.out.println(areaObtained);
    }

    public static double area(double radius) {
        if (radius<0) {
            return -1;
        }
        double a = 3.14159*radius*radius;
        return a;
    }

    public static double area(double x, double y) {
        if (x<0 || y<0) {
            return -1;
        }
        double a = x*y;
        return a;
    }
}
