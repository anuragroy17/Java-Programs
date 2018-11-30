package com.anurag;

public class Main {

    public static void main(String[] args) {
        int n=4;
        int limit=20;
        int count = 0;
        System.out.println("The even Numbers are: ");
        while(n<=limit) {
            n++;
            if(!isEven(n)) {
                continue;
            }else
                count++;
            System.out.println(n);
            if(count == 5){
                break;
            }
        }
        System.out.println("So, total even numbers found are "+count);

    }
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
