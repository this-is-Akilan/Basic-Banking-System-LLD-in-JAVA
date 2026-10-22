package Leetcode_Problems;

import java.util.*;

public class Leetcode2501 {
    public static void main(String[] args) {
        int[] nums = {4,3,6,16,8,2};
        int ans = longestSquareStreak(nums);
        System.out.println(ans);
    }
    public static int longestSquareStreak(int[] nums) {

        int count =-1;

        Set<Integer> set = new HashSet<Integer>();

        for(int i : nums){
            set.add(i);
        }

        for(int i : nums){
            int current = i;
            int rep = 1;
            while(set.contains(current * current)){
                current = current*current;
                rep++;
            }
            if(rep >=2){
                count = Math.max(count,rep);
            }
        }
        return count;
    }
}
