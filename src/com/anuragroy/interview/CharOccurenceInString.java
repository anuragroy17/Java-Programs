package com.anuragroy.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharOccurenceInString {
    public static void main(String args[]){
        String str = "Done And Gone";
        charOccurenceByIteration(str);
        charOccurenceByMaps(str);
    }

    private static void charOccurenceByIteration(String str){
        int count = 0;
        String str1=str.toLowerCase();
        char[] charArr=str1.toCharArray();

        System.out.print("By Iteration: ");
        for(char i='a' ; i<='z' ;i++){
            for (char c : charArr) {
                if (c == i) {
                    count = count + 1;
                }
            }
            if (count != 0) {
                System.out.print(i + "=" + count + " ");
                count = 0;
            }
        }
        System.out.println();
    }

    private static void charOccurenceByMaps(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        String str1 = str.toLowerCase();
        char[] chars = str1.toCharArray();

        for (char element : chars) {
            if(element == ' '){
                continue;
            }
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        System.out.println("By HashMap: " + map);
    }
}
