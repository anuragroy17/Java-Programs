package com.anuragroy.interview;

public class DigitSum {
    public static void main(String args[]){
        int num = 123;
        System.out.println("Sum of digits by iteration: "+sumOfDigitsByIteration(num));
        System.out.println("Sum of digits by recursion: "+sumOfDigitsByRecursion(num));
    }

    private static int sumOfDigitsByIteration(int num) {
        int result = 0;

        while(num>0){
            result += num%10;
            num /= 10;
        }

        return result;
    }

    static int sum = 0; //required for recursion
    private static int sumOfDigitsByRecursion(int num) {
        if(num == 0){
            return sum;
        }

        sum += num%10;
        return sumOfDigitsByRecursion(num/10);
    }
}
