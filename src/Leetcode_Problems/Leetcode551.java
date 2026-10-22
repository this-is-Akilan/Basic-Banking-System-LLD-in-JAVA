package Leetcode_Problems;

import java.util.*;

public class Leetcode551 {
    public static void main(String[] args) {
        String s = "LLLLL";
        boolean ans = checkRecord(s);
        System.out.println(ans);
    }

    public static boolean checkRecord(String s) {
        int[] a = new int[26];

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c: s.toCharArray()){
            a[c-'A']++;
            map.put(c,a[c-'A']);
        }

        System.out.println(map.get('A'));
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(map.get('P')==null){
            return false;
        }
        if(map.get('A')>2){
            return false;
        }


        int countofL = 0;

        char[] sarr = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(sarr[i]!='L'){
                countofL=0;
            }
            else if (sarr[i]=='L') {
                countofL++;
                list.add(countofL);
            }
        }

        Collections.sort(list);


        if(list.getLast()>=3){
            return false;
        }

        return true;
    }
}
