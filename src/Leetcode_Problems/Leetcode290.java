package Leetcode_Problems;

import java.util.HashMap;

public class Leetcode290 {
    public static void main(String[] args) {

        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        boolean ans = wordPattern(pattern,s);
        System.out.println(ans);

    }

    public static boolean wordPattern(String pattern, String s){

        String[] words = s.split(" ");

//        System.out.println(pattern.length());
//        System.out.println(words.length);

        if(words.length != pattern.length()){
            return false;
        }
        HashMap<Character,String> c2w = new HashMap();
        HashMap<String,Character> w2c = new HashMap();


        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String a = words[i];

            if(c2w.containsKey(c)){
                if(!c2w.get(c).equals(a)){
                    return false;
                }
            }

            else{
                if(w2c.containsKey(a)){
                    return false;
                }
                c2w.put(c,a);
                w2c.put(a,c);
            }
        }
        return true;
    }
}

