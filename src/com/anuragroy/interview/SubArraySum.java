/* To Find Continuous Sub Array In Array Whose Sum Is Equal To Number */
package com.anuragroy.interview;

import java.util.Arrays;

public class SubArraySum {

    public static void main(String[] args) {
        System.out.println("======Method 1======");
        findSubArray1(new int[]{42, 15, 12, 8, 6, 32}, 26);
        System.out.println();
        System.out.println("======Method 2======");
        findSubArray2(new int[]{42, 15, 12, 8, 6, 32}, 26);
    }

    public static void findSubArray1(int[] inputArray, int inputNumber) {
        int sum = inputArray[0];
        int start = 0;
        for (int i = 1; i < inputArray.length; i++) {
            //Adding inputArray[i] to the current 'sum'
            sum = sum + inputArray[i];

            //If sum is greater than inputNumber then following loop is executed until
            //sum becomes either smaller than or equal to inputNumber
            while (sum > inputNumber && start <= i - 1) {
                //Removing starting elements from the 'sum'
                sum = sum - inputArray[start];
                //Incrementing start by 1
                start++;
            }

            //If 'sum' is equal to 'inputNumber' then printing the sub array
            if (sum == inputNumber) {
                System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is ");
                for (int j = start; j <= i; j++) {
                    System.out.print(inputArray[j] + " ");
                }
                System.out.println();
            }
        }
    }

    static void findSubArray2(int[] inputArray, int inputNumber) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            //Assigning inputArray[i] to 'sum'
            sum = inputArray[i];
            for (int j = i + 1; j < inputArray.length; j++) {
                //Adding inputArray[j] to 'sum'
                sum = sum + inputArray[j];

                //If 'sum' is equal to 'inputNumber' then printing the sub array
                if (sum == inputNumber) {
                    System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is ");

                    for (int k = i; k <= j; k++) {
                        System.out.print(inputArray[k] + " ");
                    }
                    System.out.println();
                }

                //if 'sum' is smaller than 'inputNumber', continue the loop
                else if (sum < inputNumber) {
                    continue;
                }

                //if 'sum' is greater than 'inputNumber', then break the loop
                else if (sum > inputNumber) {
                    break;
                }
            }
        }
    }
}
