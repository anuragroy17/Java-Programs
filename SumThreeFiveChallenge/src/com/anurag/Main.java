package com.anurag;

public class Main {

    //Create a for statement using a range of numbers from 1 to 1000 inclusive.

    //Sum all the numbers that can be divided with both 3 and also with 5.

    //For those numbers that met the above conditions, print out the number.

    //break out of the loop once you find 5 numbers that met the above conditions.

    //After breaking out of the loop print the sum of the numbers that met the above conditions.

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value"; //using a constant by final keyword
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        System.out.println("The Numbers are ");
        for (int i=1;i<1000;i++) {
            if(i%3==0 && i%5==0) {
                System.out.print(i + " ");
                sum = sum + i;
                count++;
            }
            if(count==5){
                break;
            }
        }
        System.out.println("\nThe total is "+sum);
    }
}
