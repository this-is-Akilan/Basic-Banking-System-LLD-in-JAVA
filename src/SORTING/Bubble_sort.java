package SORTING;

import java.util.*;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {56,55,75,12,45,8,32,4,10};
        System.out.println(Arrays.toString(ans(arr)));
    }
    public static int[] ans(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            boolean swapped = false;
            for(int j = 0 ; j < n-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }
}
