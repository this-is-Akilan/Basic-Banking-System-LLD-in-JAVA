package Leetcode_Problems; //// Leetcode 1337 ---> k weakest rows in a matrix
//
//import java.util.*;
//
//public class Leetcode_Problems.Matrix {
//    public static void main(String[] args) {
//        int[][] image = { {1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1} };
//        int k = 3;
//
//        int[][] ans = flipAndInvertImage(image);
//        System.out.println(Arrays.deepToString(ans));
//    }
//    public static int[][] flipAndInvertImage(int[][] image) {
//
//        int a = image.length;
//        int b = image[0].length;
//
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//
////        ArrayList<Integer> row = new ArrayList<>();
////        ArrayList<Integer> soldiers = new ArrayList<>();
//
//        for(int i = 0; i<a ; i++){
//            int count = 0;
//
//            for(int j = 0; j<b ; j++){
//                if(image[i][j] == 1){
//                    count++;
//                }
//                if(image[i][j] == 0) break;
//            }
//
////            row.add(i);
////            soldiers.add(count);
//            map.put(i,count);
//
//        }
////        row.stream().sorted();
//        System.out.println(map);
//
//        return new int[][] {};
//    }
//}


import java.util.*;

public class Matrix{
    public static void main(String[] args) {
        int[][] mat = { {1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1} };
        int k = 3;

        int[] ans = kWeakestRows(mat , k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] kWeakestRows(int[][] mat, int k){

        int m = mat.length;
        int n = mat[0].length;

//        updating in the list:

        List<int[]> row = new ArrayList<>();
        for(int i = 0; i<m ; i++){
            int count = countSoldier(mat[i]);
            row.add(new int[] {count,i});

        }

//        sorting:

        Collections.sort(row,(a,b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else{
                return Integer.compare(a[1],b[1]);
            }
        });

//      iterating the list to get the desired op:

        int[] result = new int[k];
        for(int i = 0; i<k ; i++){
            result[i] = row.get(i)[1];
        }

        return result;
    }

//    using binary search for counting as it is in a sorted way...

    private static int countSoldier(int[] row){

        int l = 0;
        int r = row.length;

        while(l<r){

            int mid = l + (r-l)/2;

            if(row[mid] == 1){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}