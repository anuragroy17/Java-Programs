package com.anuragroy.interview;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please enter a positive value below 3999: ");
            int num = sc.nextInt();
            sc.nextLine();
            if(num<3999 && num>=0){
                System.out.println("Value in Roman Numerals: "+intToRoman(num));
            }else{
                System.out.println("Value not in Range");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }

    private static String intToRoman(int num){
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[(num / 1000)]     //Consider 3925 => 3925/1000 = 3.925 => int = 3
                +hundreds[(num%1000)/100]  //Consider 3925 => 3925%1000 => (3925 - 3000)Remainder is 925 => 925/100 = 9.25 => int = 9
                +tens[(num%100)/10]        //Consider 3925 => 3925%100 => (3925 - 3900)Remainder is 25 => 25/10 = 2.5 => int = 2
                +units[(num%10)];           //Consider 3925 => 3925%10 => (3925 - 3920)Remainder is 5
    }

}
