package Leetcode_Problems;

import java.util.*;
public class Leetcode496 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};

        int[] ans = nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int temp = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==temp ){
                    for(int k=j;k< nums2.length;k++){
                        if(nums2[k]>temp){
                            arr[i] = nums2[k];
                            break;
                        }
                        else{
                            arr[i] = -1;
                        }
                    }
                }
            }
        }
        return arr;
    }
}
