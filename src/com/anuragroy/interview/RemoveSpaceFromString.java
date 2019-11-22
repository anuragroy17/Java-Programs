/* Remove all white spaces from a string in java */
package com.anuragroy.interview;

public class RemoveSpaceFromString {

    public static void main(String args[]){
        String str = "  Hel  lo World-   o r- My Wo  rld";
        System.out.println("Original String: " + str);
        removeByRegex(str);
        removeByIteration(str);

    }


    private static void removeByRegex(String str){
        str = str.replaceAll("\\s", "");
        System.out.println("After Regex Replacement: " + str);
    }


    private static void removeByIteration(String str){
        char [] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<=chars.length-1; i++){
            if(chars[i]!=' '){
                result.append(chars[i]);
            }
        }
        System.out.println("After Iteration Replacement: " + result.toString());
    }
}
