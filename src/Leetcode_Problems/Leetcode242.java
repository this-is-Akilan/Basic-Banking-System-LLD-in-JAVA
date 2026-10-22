package Leetcode_Problems;

import java.util.*;
public class Leetcode242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "rat";

        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] a= s.toCharArray();
        char[] b= t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            return true;
        }
        else{
            return false;
        }
    }
}
