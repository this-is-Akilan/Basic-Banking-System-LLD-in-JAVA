package Leetcode_Problems;// check if the string is a valid palindrome or not



import java.util.*;
//public class Leetcode680 {
//    public static void main(String[] args) {
//        String s = "abcca";
//        StringBuilder s1 = new StringBuilder(s);
//        s1.reverse();
//
//        char[] arr = s.toCharArray();
//        ArrayList<Character> list =  new ArrayList<Character>();
//
//        for(char c:arr){
//            list.add(c);
//        }
//        for(int i=0; i<s.length();i++){
//            char a = list.remove(i);
//            if(list.contains(s1)){
//                System.out.println(true);
//            }
//        }
//    }
//}

public class Leetcode680 {
    public static void main(String[] args) {

        String s = "aabaca";

        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();

        String s2 = s1.toString();
        char [] a = s.toCharArray();
        char [] b = s2.toCharArray();

        System.out.println(a);
        System.out.println(b);

        ArrayList<Character> list1 = new ArrayList<Character>();
        ArrayList<Character> list2 = new ArrayList<Character>();

        for(char c:a){
            list1.add(c);
        }
        for(char c:b){
            list2.add(c);
        }
        System.out.println(list1);
        System.out.println(list2);

        int count =0;
        char z = 0;

        for(int i=0;i<s.length();i++){
            if (a[i]!=b[i]){
                z = b[i];
            }
        }
        System.out.println(z);
        list1.remove(z);
        if(list1.equals(list2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
