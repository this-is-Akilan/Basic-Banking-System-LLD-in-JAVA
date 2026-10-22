package Leetcode_Problems;//import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Leetcode3427 {
//    public static void main(String[] args) {
//        int[] nums={3,1,1,2};
//        int ans = subarraySum(nums);
//        System.out.println(ans);
//    }
//    public static int subarraySum(int[] nums) {
//        int n= nums.length;
//        int[] list =new int [n];
//        int sum=0;
//        int temp=0;
//        list[0]= nums[0];
//        for(int i =0;i<n;i++){
//            for(int j=1;j<n;j++) {
//                sum = nums[i] + nums[j];
//                i++;
//                list[i]= sum;
//            }
//        }
//        for(int i=0;i<n;i++){
//            temp += list[i];
//        }
//        System.out.println(Arrays.toString(list));
//        return temp;
//    }
//}

//public class Leetcode3427 {
//    public static void main(String[] args) {
//
//        int[] nums2 = {3,1,1,3};
//        System.out.println(totalSubarraySum(nums2));
//    }
//
//    public static int totalSubarraySum(int[] nums) {
//        int sum =0;
//        int n = nums.length;
//        int ini = nums[0];
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                sum+=nums[j];
//            }
//        }
//        return sum;
//    }
//}

//correct method
public class Leetcode3427 {
    public static void main(String[] args) {

        int[] nums2 = {3, 1, 1, 2};
        System.out.println(subarraySum(nums2));
    }
        public static  int subarraySum(int[] nums) {
            int totalSum = 0;
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                int start = Math.max(0, i - nums[i]);
                int subarraySum = 0;

                for (int j = start; j <= i; j++) {
                    subarraySum += nums[j];
                }

                totalSum += subarraySum;
            }
            return totalSum;
        }
    }
