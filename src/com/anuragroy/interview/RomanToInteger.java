package com.anuragroy.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please a valid Roman Numeral ");
            String roman = sc.nextLine();
            System.out.println("Value in Numerals: "+ romanToInt(roman));
        } catch (Exception e) {
            System.out.println("Invalid Roman Numeral");
        }

        sc.close();
    }

    private static int romanToInt(String roman) {
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I',1);
        mapping.put('V',5);
        mapping.put('X',10);
        mapping.put('L',50);
        mapping.put('C',100);
        mapping.put('D',500);
        mapping.put('M',1000);
        mapping.put('i',1);
        mapping.put('v',5);
        mapping.put('x',10);
        mapping.put('l',50);
        mapping.put('c',100);
        mapping.put('d',500);
        mapping.put('m',1000);

        int result = 0;

        for (int i=0; i<roman.length(); i++) {
            if (i > 0 && mapping.get(roman.charAt(i))>mapping.get(roman.charAt(i-1)))
                result += mapping.get(roman.charAt(i)) - 2 * mapping.get(roman.charAt(i-1));
            else
            result += mapping.get(roman.charAt(i));
        }

        return result;
    }
}
