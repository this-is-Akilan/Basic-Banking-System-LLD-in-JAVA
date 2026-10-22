package ZOHO;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int n = 6;
        int[] inpArr = {-20 , 10 , 55 , -5 , 30 ,10};

        int[] opArr = new int[n];

        opArr[0] = Math.abs(inpArr[0] - inpArr[1]);
        opArr[1] = Math.abs(inpArr[n-1] - inpArr[n-2]);

        for(int i = 1 ; i < n-1 ; i++){

            opArr[i] = inpArr[i] + Math.abs(inpArr[i] + inpArr[i+1]) + Math.abs(inpArr[i] + inpArr[i-1]);
        }
        System.out.println(Arrays.toString(opArr));
    }
}
