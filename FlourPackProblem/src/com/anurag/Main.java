package com.anurag;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";

    public static void main(String[] args) {
        boolean isPacked=canPack(1,0,4);
        System.out.println(isPacked);
        isPacked=canPack(1,0,5);
        System.out.println(isPacked);
        isPacked=canPack(0,5,4);
        System.out.println(isPacked);
        isPacked=canPack(2,2,12);
        System.out.println(isPacked);
        isPacked=canPack(-3,2,12);
        System.out.println(isPacked);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount>=0 && smallCount>=0 && goal>=0){
            for(int i=0;i<=bigCount;i++){
                for(int j=0;j<=smallCount;j++){
                    if((i*5) + (j*1) == goal){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
