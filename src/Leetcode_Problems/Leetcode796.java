package Leetcode_Problems;//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//
//A shift on s consists of moving the leftmost character of s to the rightmost position.
//
//For example, if s = "abcde", then it will be "bcdea" after one shift.
//
//
//        Example 1:
//
//Input: s = "abcde", goal = "cdeab"
//Output: true
//Example 2:
//
//Input: s = "abcde", goal = "abced"
//Output: false

public class Leetcode796 {
    public static void main(String[] args) {
        String s = " ";
        String goal = "";
        boolean ans = rotateString(s,goal);
        System.out.println(ans);
    }
    public static  boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String merged = s+s;

        if(merged.contains(goal)){
            return true;
        }
        return false;
    }
}
