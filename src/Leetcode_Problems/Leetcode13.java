package Leetcode_Problems;

import java.util.*;

public class Leetcode13 {
    public static void main(String[] args) {
        String S = "LVIII";
        System.out.println(romanToInt(S));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            // if next char exists and is bigger → subtract
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value;
            }
            else {
                result += value;
            }
        }

        return result;
    }
}
