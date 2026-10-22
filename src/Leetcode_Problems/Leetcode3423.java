package Leetcode_Problems;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode3423 {
    public static void main(String[] args) {
        int[] nums = {2,1,0};
        int ans = maxAdjacentDistance(nums);
        System.out.println(ans);
    }
    public static int maxAdjacentDistance(int[] nums) {

        int[] arr = new int[nums.length+1];
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            arr[i]=nums[i];
        }
        arr[n-1]=nums[0];

        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp =0;
        int j =1;
        for(int i=0;i<n;i++){
            if(j<n){
                temp =Math.abs(arr[i]-arr[j]) ;
                list.add(temp);
                j++;
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list.getLast();
    }
}
