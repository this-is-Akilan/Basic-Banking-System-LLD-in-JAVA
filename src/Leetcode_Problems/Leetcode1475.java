package Leetcode_Problems;

import java.util.Arrays;

public class Leetcode1475 {
    public static void main(String[] args) {
        int[] prices = {8,7,4,2,8,1,7,7,10,1};
        int[] ans = finalPrices(prices);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] finalPrices(int[] prices) {

        int[] result = new int[prices.length];

        for(int i=0;i<prices.length;i++){

            result[i] = prices[i];

            for(int j=i+1;j< prices.length;j++){
                if(prices[i]>=prices[j]){
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return result;
    }
}
