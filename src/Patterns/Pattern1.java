package Patterns;

import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
//        pattern3(n);
        pattern14(n);
    }
    public static void pattern(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = n-1 ; j>= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < (2* i + 1) ; k++){
                System.out.print("*");
            }
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < 2*n - (2 *i +1) ; k++){
                System.out.print("*");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = 0 ; i <= 2*n - 1 ; i++){
            int stars  = i;
            if(i > n) stars = 2*n-i;

            for(int j = 1 ; j <= stars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        int start = 1;

        for(int i = 0 ; i < n; i++){
            if(i % 2 == 0) start = 1;
            else start = 0;

            for(int j = 0 ; j <= i ; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        int start = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            for(int k = 0 ; k < 2*n - 2*i  ; k++){      // k = 2 * (n-1)..... thia ia also valid
                System.out.print(" ");
            }
            for(int j = i ; j>= 1 ; j--){
                System.out.print(j);
            }
            start++;
            System.out.println();
        }
    }
    public static void pattern8(int n){

        int num = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i = 0 ; i < n ; i++){
            int num = 0;
            for(int j = n-1 ; j >= i ; j--){
                System.out.print((char)('A' + num ));
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            char c = 'A';
            int breakpt = (2*i+1)/2;
            for(int k = 1 ; k <= 2*i+1 ; k++){
                System.out.print(c);
                if(k <= breakpt) c++;
                else c--;
            }
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        for(int i = 0 ; i < n ; i++){
            for(char ch =(char) ('E' - i) ; ch <= 'E' ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i = 0 ; i < n ; i++) {
//            stars
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
//            space
            for (int k = 1; k <= i * 2; k++) {
                System.out.print(" ");
            }
//            stars
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int k = 0 ; k < 2*n - 2*i  ; k++){      // k = 2 * (n-1)..... thia ia also valid
                System.out.print(" ");
            }
            for(int j = i ; j>= 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
