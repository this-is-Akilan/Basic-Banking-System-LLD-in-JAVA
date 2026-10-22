package CTS_Questions;

import java.util.*;

public class Binary_palindrome {
    public static void main(String[] args) {
        int n = 6;
        int num = 110100;
        System.out.println(ans(n,num));
    }
    public static int ans(int n, int num){
        int oneCount = 0;
        int zeroCount = 0;
        String binaryNum = String.valueOf(num);

        for(char c : binaryNum.toCharArray() ){
            if(c == '0'){
                zeroCount++;
            }
            else{
                oneCount++;
            }
        }
        if(zeroCount < oneCount){
            return zeroCount;
        }
        return oneCount;
    }
}
