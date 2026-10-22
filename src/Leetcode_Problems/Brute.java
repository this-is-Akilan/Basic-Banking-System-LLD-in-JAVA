package Leetcode_Problems;//import java.util.ArrayList;
//
//public class Brute {
//    public static void main(String[] args) {
//        int[] a = {13,14,32,21,45,5};
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i<a.length ; i++){
//            boolean w = true;
//            for(int j = 1 ; j< a.length ; j++){
//                if(a[i]<a[j]){
//                    w = false;
//                    break;
//                }
//            }
//            if(w){
//                list.add(a[i]);
//            }
//        }
//        System.out.println(list);
//    }
//}
//
//

import java.util.ArrayList;
import java.util.Arrays;

public class Brute {
    public static void main(String[] args) {
        int[] a = {13,14,32,21,45,5};
        int[] ans = leader(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] leader(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< a.length;i++){
            if(isBig(a,i)){
                list.add(a[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private static boolean isBig(int[] a,int i){
        for(int j = i+1; j< a.length ; j++){
            if(a[i]<=a[j]){
                return false;
            }
        }
        return true;
    }
}
