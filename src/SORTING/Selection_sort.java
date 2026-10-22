package SORTING;
import java.util.*;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {45,6,8,65,88,24};
        System.out.println(Arrays.toString(ans(arr)));
    }
    public static int[] ans(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
