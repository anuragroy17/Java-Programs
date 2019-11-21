package com.anuragroy.initial;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; //int min=0
        int max = Integer.MIN_VALUE;   //int max=0
//        boolean first = true;  //Solution to remove bug of min being zero all time

        while(true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int number = scanner.nextInt();

//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("min= "+ min + ", max= " + max);
        scanner.close();
    }
}
