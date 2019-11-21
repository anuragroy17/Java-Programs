package com.anuragroy.initial;

import java.util.Scanner;

public class NumberToWords2 {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        sc.close();
        numberToWords(num);
    }
    public static int reverse(int number) {
        int reverse=0;
        while (number!=0){
            reverse = reverse*10 + number%10;
            number/=10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        int count=0;
        if(number<0)
            return -1;
        if(number==0)
            count++;
        while(number!=0){
            count++;
            number/=10;
        }
        return count;
    }
    public static void numberToWords(int number) {
        if(number<0){
            System.out.println("Invalid Value");
        }else {
            int count = getDigitCount(number);
            number = reverse(number);
            while (number != 0) {
                int digit = number % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        count--;
                        break;
                    case 1:
                        System.out.println("One");
                        count--;
                        break;
                    case 2:
                        System.out.println("Two");
                        count--;
                        break;
                    case 3:
                        System.out.println("Three");
                        count--;
                        break;
                    case 4:
                        System.out.println("Four");
                        count--;
                        break;
                    case 5:
                        System.out.println("Five");
                        count--;
                        break;
                    case 6:
                        System.out.println("Six");
                        count--;
                        break;
                    case 7:
                        System.out.println("Seven");
                        count--;
                        break;
                    case 8:
                        System.out.println("Eight");
                        count--;
                        break;
                    case 9:
                        System.out.println("Nine");
                        count--;
                        break;
                }
                number /= 10;
            }
            for(int i=0;i<count;i++)
                System.out.println("Zero");
        }
    }
}
