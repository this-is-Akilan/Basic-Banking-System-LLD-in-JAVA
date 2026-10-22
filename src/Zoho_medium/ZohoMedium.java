package Zoho_medium;
import java.util.*;

//Longest Palindromic Substring   (no consecutive)
class ZohoMedium {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s){
        if (s == null || s.isEmpty()) return "";
        int start = 0 , end = 0;
        for(int i = 0 ; i < s.length() ; i++){
//            for odd length
            int left = i , right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left +1 > end - start + 1){
                    end = right;
                    start = left;
                }
                left--;
                right++;
            }
//            for even length
            left = i;
            right = i+1;

            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left +1 > end - start +1){
                    end = right;
                    start = left;
                }
                left--;
                right++;
            }
        }
        return s.substring(start , end+1);
    }
}

//Longest Substring Without Repeating Characters
class LongestSubstirng{
    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(longestSubString(s));
    }
    public static int longestSubString(String s){
        Set<Character> set = new HashSet<>();
        int left = 0 , right =  0;
        int maxlen = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                maxlen = Math.max(maxlen , right - left +1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}

// container with most water
class Conainer{
    public static int ContainerWithMostWater(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        while(start < end){
            int wi = end - start;
            int ht = Math.min(height[start],height[end]);
            area = Math.max(wi*ht , area);
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return area;
    }
}
