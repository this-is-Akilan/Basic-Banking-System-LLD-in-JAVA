package Leetcode_Problems;

import java.util.Arrays;

public class Leetcode387 {
    public static void main(String[] args) {
        String s = "leetcodllove";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
    public static int firstUniqChar(String s) {
        int[] arr = new int[26];

        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
