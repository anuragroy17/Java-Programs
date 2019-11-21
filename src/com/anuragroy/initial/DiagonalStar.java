package com.anuragroy.initial;

public class DiagonalStar {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if(number>=5) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number || i == j || number + 1 == i + j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
