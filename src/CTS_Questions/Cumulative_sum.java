package CTS_Questions;

import java.util.*;

public class Cumulative_sum {
    public static void main(String[] args) {
        String s = "azcar";
        System.out.println(cumulativeSum(s));
    }
    public static int cumulativeSum(String s){
        int sum = 0;
        for(int i = 0; i<s.length() - 1 ; i++){
            sum += s.charAt(i+1) - s.charAt(i);
        }
        return sum;
    }
}
