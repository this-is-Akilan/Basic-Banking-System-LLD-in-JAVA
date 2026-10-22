//package Oct2;
//
//import java.util.ArrayList;
//
////Given unsorted array find all combination of the element for a given sum. Order should be maintained.
////Input :
////    8 3 4 7 9 N=7
////Output
////{3 4 } {7}
//import java.util.*;
//
//public class Unsorted_Arr {
//    public static void main(String[] args) {
////        int[] arr = {-2 ,-3 , 4 ,-1  -2 , 1 , 5 , -3};
////        contigiusSubArr(arr);
//        char[][] grid = {
//                {'a','z','o','l'},
//                {'n','x','h','o'},
//                {'v','y','i','v'},
//                {'o','r','s','e'}
//        };
//        String[] dictionary = {"van" , "zoho" , "love" , "is"};
//        findingWords(grid , dictionary);
//    }
//    //Given array find maximum sum of contiguous sub array
////input
////{-2 -3 4 -1 -2 1 5 -3}
////output
////    max 7 and elements  are [ 4 -1 -2 1 5]
//
//    public static void contigiusSubArr(int[] arr){
//        int max = arr[0];
//        int maxtill = arr[0];
//        int s = 0;
//        int end = 0;
//        int s2 = 0;
//
//        for(int i = 0 ; i < arr.length-1; i++){
//            for(int j = s ; j <end ; j++){
//                if(arr[i] > maxtill+arr[i+1]){
//                    maxtill = arr[i];
//                    s2 = i;
//                }
//                else{
//                    maxtill += arr[i];
//                }
//
//                if(maxtill > max){
//                    max = maxtill;
//                    s = s2;
//                    end = i;
//                }
//            }
//            }
//
//        System.out.println(maxtill);
//    }
////    public static ArrayList ans(int[] arr , int target){
////
////        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
////        for(int i = 0 ; i < arr.length-1 ; i++){
////            if(arr[i] + arr[i+1] == target){
////                list.add(arr[i]);
////            }
////            else if (arr[i] == target) {
////                list.add(arr[i]);
////            }
////        }
////    }
////Given a 2D grid of characters, you have to search for all the words in a dictionary by
////moving only along two directions, either right or down. Print the word if it occurs.
//
////    Sample :
////    a   z  o   l
////    n   x  h   o
////    v   y   i  v
////    o   r   s  e
////
////    Dictionary = {van, zoho, love, are, is}
////
////    Output:
////    zoho
////    love
////    Is
//
//    public static void findingWords(char[][] grid , String[] dictionary){
//        int a = 0;
//        for(int i = 0 ; i < 4; i++){
//            for(int j = 0 ; j < 4 ; j++){
//                if(grid[i][j] == target(dictionary).charAt(a)){
//                    a++;
//                    while(a < target(dictionary).length()){
//                        int right = i;
//                        int down = j;
//                        if(target(dictionary).charAt(right +1) == target(dictionary).charAt(a)){
//                            right++;
//                        }
//                        else if(target(dictionary).charAt(down +1) == target(dictionary).charAt(a)){
//                            down++;
//                        }
//                        else{
//
//                        }
//                    }
//                }
//            }
//        }
//    }
//    public static String target(String [] dictionary)
//}
