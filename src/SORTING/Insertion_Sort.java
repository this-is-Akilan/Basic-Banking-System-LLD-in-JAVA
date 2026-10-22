package SORTING;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {45,6,8,65,88,24};
        System.out.println(Arrays.toString(ans(arr)));
    }
    public static int[] ans (int[] arr){
        int n = arr.length;

        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
