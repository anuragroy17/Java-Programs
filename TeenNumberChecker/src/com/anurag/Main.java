package com.anurag;

public class Main {

    public static void main(String[] args) {
        boolean check;
        check= hasTeen(9,99,19);
        System.out.println(check);
        check= hasTeen(23,15,42);
        System.out.println(check);
        check= hasTeen(22,23,34);
        System.out.println(check);
    }
    public static boolean hasTeen(int x,int y, int z) {
        if ((x>=13 && x<=19)||(y>=13 && y<=19)||(z>=13 && z<=19)){
            return true;
        }
        return false;
    }
}
