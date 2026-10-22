package CTS_Questions;

import java.util.ArrayList;

public class CTS_q3 {
    public static void main(String[] args) {
        int n = 83;
        int ans = answer(n);
        System.out.println(ans);
    }
    public static int answer(int n){
        if(n == 0) return 0;

        int resilt = n % 9;
        return resilt == 0 ? 9 : resilt ;
    }
}
