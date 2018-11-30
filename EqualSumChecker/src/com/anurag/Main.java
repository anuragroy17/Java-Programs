package com.anurag;

public class Main {

    public static void main(String[] args) {
        boolean check;
        check= hasEqualSum(1,1,1);
        System.out.println(check);
        check= hasEqualSum(1,1,2);
        System.out.println(check);
        check= hasEqualSum(1,-1,0);
        System.out.println(check);
    }
    public static boolean hasEqualSum(int x,int y, int z) {
        int a = x+y;
        if (a==z){
            return true;
        }
        return false;
    }
}
