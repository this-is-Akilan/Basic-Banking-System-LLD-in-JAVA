package Leetcode_Problems;

import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] ans  = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static  int[] productExceptSelf(int[] nums) {

        int[] finalarr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int leftprod = 1;
            int rightprod=1;

            for(int j=0;j<i;j++){
                leftprod *= nums[j];
            }

            for(int k = i+1;k<nums.length;k++){
                rightprod *= nums[k] ;
            }

            finalarr[i] = rightprod * leftprod;
        }
        return finalarr;
    }

}
