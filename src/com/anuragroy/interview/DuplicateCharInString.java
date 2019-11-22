/* Find Duplicate Characters In A String In Java */
package com.anuragroy.interview;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString {

    public static void main(String[] args) {
        duplicateCharCount("Better Butter");
    }

    public static void duplicateCharCount(String inputString) {

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        Set<Character> charsInString = charCountMap.keySet();

        System.out.println("Duplicate Characters In " + inputString);

        for (Character ch : charsInString) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }

    //Please Refer DuplicateElementInArray for more methods (interview related)

}
