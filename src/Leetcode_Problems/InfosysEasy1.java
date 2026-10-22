package Leetcode_Problems;

import java.util.*;

public class InfosysEasy1 {
    public static void main(String[] args) {

//        getting inputs
//        For Array
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int i = 0;i<n ; i++){
            A[i] = in.nextInt();
        }
//        for Queries
        int q = in.nextInt();
        int[][] qs = new int[q][3];

        for(int i = 0; i<q; i++){
            for(int j = 0; j<3; j++){
                qs[i][j] = in.nextInt();
            }
        }

//        now returning part
        int ans = Ommala(n,A,q,qs);
        System.out.println(ans);

    }

    public static int Ommala(int n, int[] A, int q, int[][] qs){

        int sum = 0;

        for(int i =0; i<q; i++){
//            query 1
            if(qs[i][0] == 1) {
//                replace A[i] with (i-l+1)*A[i]
                int l = qs[i][1];
                int r = qs[i][2];

                for(int a = l;a<=r ; a++){
                    A[a] = (a - l + 1) * A[l];
                }
            }
//            query 2
            else{
                if(qs[i][0] == 2){
                    int l = qs[i][1];
                    int r = qs[i][2];
                    int currentsum = 0;

                    for(int a = l; a<=r; a++){
                        currentsum += A[a];
                    }

                    sum += currentsum;
                }
            }
        }
        return sum;
    }
}
