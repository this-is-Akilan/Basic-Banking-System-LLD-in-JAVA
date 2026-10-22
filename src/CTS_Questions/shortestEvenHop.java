package CTS_Questions;

import java.util.*;

public class shortestEvenHop {
    public static void main(String[] args) {
        int a = 1;
        int[] b = {2};
        System.out.println(ans(a,b));
    }
    public static int ans(int a, int[] b){

        if(a <= 1){
            return -1;
        }

        for(int hop = 1 ; hop < a ; hop++){
            boolean valid = true;
            for(int index = 0 ; index< a ; index += hop){
                if(b[index] % 2 != 0){
                    valid = false;
                    break;
                }
            }
            if(valid){
                return hop;
            }
        }
        return -1;
    }
}
