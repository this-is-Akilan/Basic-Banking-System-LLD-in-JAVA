package CTS_Questions;

import java.util.*;

public class CTS_q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        int ans = minimumBusCost(n,p,q);
        System.out.println(ans);
    }
    public static int minimumBusCost(int n, int p, int q){

        int minCost = Integer.MAX_VALUE;
        int maxBus = (n / 80) + 2;

        for(int i = 0; i<=maxBus ; i++){
            int peoplePerBus = i * 80;
            int remaining = Math.max(n - peoplePerBus , 0);
            int shuttle = (remaining + 7) / 8;

            int totalCost = (75*p*i) + (shuttle * q* 75);
            if(totalCost < minCost){
                minCost = totalCost;
            }
        }
        return minCost;
    }
}
