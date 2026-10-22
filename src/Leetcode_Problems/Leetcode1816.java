package Leetcode_Problems;

import java.util.*;

public class Leetcode1816 {
    public static void main(String[] args) {
        String s = "What is the solution";
        int k =1;
        String ans = truncateSentence(s,k);
        System.out.println(ans);
    }
    public static  String truncateSentence(String s, int k) {

        String[] a = s.split(" ");
        ArrayList<String> list = new ArrayList<String>();

        int i=0;

        if(k>a.length){
            return s;
        }

//        System.out.println(Arrays.toString(a));

        for(i=0;i<k;i++){
            list.add(a[i]);
        }
//        System.out.println(list);

//        System.out.println(list);

        StringBuilder bubu = new StringBuilder();
        for(String c :list){
            bubu.append(c+" ");
            i++;
        }
        bubu.toString().strip().stripTrailing();
        return bubu.toString() ;
    }
}
