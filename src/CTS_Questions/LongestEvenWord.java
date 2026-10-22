package CTS_Questions;

import java.util.*;

public class LongestEvenWord {
    public static void main(String[] args) {
        String S = "Apple egg omlette Orange eagle chair eereee";
        System.out.println(longestString(S));
    }
    public static String longestString(String S){
        String longest = "00";
        int maxlen = 0;

        String[] hehe = S.split(" ");

        for(String word : hehe){
            if(isVowel(word.charAt(0)) && word.length() % 2 == 0){
                if(word.length() > maxlen){
                    maxlen = word.length();
                    longest = word;
                }
            }
        }
        return longest;
    }
    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
