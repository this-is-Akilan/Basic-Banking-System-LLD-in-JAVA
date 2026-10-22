package Leetcode_Problems;

import java.util.*;

public class Leetcode1408 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        Leetcode1408 obj = new Leetcode1408();
        System.out.println(obj.stringMatching(words));
    }

    public List<String> stringMatching(String[] words) {

        ArrayList<String> list1 = new ArrayList<String>();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(i != j && words[i].contains(words[j])) {
                    if(!list1.contains(words[j])) {
                        list1.add(words[j]);
                    }
                }
            }
        }
        return list1;
    }
}