package CTS_Questions;

import java.util.*;

public class CTS_q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = answer(n);
        System.out.println(ans);
    }
    public static int answer(int n){
        int maxSquare = 1;
        int maxCube = 1;

        for(int i = 2;i<=n; i++){
            int a = i*i;
            if(square(a,n)){
                maxSquare = Math.max(a,1);
            }
            int b = a*i;
            if(cube(b,n)){
                maxCube = Math.max(b,1);
            }
        }
        return maxCube + maxSquare ;
    }
    private static boolean square(int a , int n){
        for(int i = 2; i<= n; i++){
            if(a == i){
                return true;
            }
        }
        return false;
    }

    private static boolean cube(int b, int n){
        for(int i = 2; i<= n; i++){
            if(b == i){
                return true;
            }
        }
        return false;
    }
}
