/* Find All Pairs of Elements In An Array Whose Sum Is Equal To A Given Number */
package com.anuragroy.interview;

public class ElementPairSum {
    public static void main(String args[]) {
        findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
    }

    private static void findPairs(int[] arr, int num) {
        int i = 0;
        int j = 1;
        while (j<arr.length) {
            int temp = arr[i]+arr[j];
            if(temp == num) {
                System.out.println(arr[i]+":"+arr[j]);
            }
            j++;
            if(j == arr.length) {
                j = i+1;
                i++;
            }
        }
    }
}
