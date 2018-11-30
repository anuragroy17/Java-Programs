package com.anurag;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        if(number>=1) {
            for (int i=1;i<=number;i++) {
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}