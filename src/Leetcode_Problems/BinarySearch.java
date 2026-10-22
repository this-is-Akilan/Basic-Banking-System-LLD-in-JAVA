package Leetcode_Problems;

import java.util.TreeSet;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {-2,-1,-1,1,2,3,4,5,6,7,8,9};
        int[] nums2 = {};
        int ans = heeh(nums1,nums2);
        System.out.println(ans);
    }
    public static int heeh(int[] nums1, int[] nums2){

        int a = nums1.length;
        int b = nums2.length;

        TreeSet<Integer> set  = new TreeSet<>();
        
        for(int i =0;i<a;i++) {
            int element =0;


            if (nums1[i] == element){
                set.add(nums1[i]);
            }
        }

        return set.first();

    }
}
