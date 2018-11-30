package com.anurag;

public class Main {

    public static void main(String[] args) {
        boolean check;
        check = bark(true, 1);
        System.out.println(check);
        check = bark(false, 2);
        System.out.println(check);
        check = bark(true, 8);
        System.out.println(check);
        check = bark(true, -1);
        System.out.println(check);

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean isBark = false;
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay < 8) {
                isBark = true;
                return isBark;
            } else if (hourOfDay > 22 && hourOfDay <= 23) {
                isBark = true;
                return isBark;
            } else if (hourOfDay < 0 || hourOfDay > 23) {
                isBark = false;
                return isBark;
            }
        }
        return isBark;
    }
}
