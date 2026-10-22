package TCS_digital_Coding;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();

        int[] ans = Answer(n,arr,k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Answer(int n, int[] arr, int k){

//        if k is greater than n, we need to use modulo here so that we can get the same rotation
        if(k>n){
            k = k%n;
        }
        int[] num = new int[n];
//        1st for loop to print the rotated elements in the array
        for(int i = 0; i<k; i++){
            num[i] = arr[n - k + i];
        }

//        2nd for loop to print the remaining elements in the array
        int ind = 0;
        for(int i = k; i<n; i++){
            num[i] = arr[ind++];
        }

        return num;
    }
}
