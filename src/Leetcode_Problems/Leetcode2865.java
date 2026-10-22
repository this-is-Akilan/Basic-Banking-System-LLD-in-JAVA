package Leetcode_Problems;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode2865 {
    public static void main(String[] args) {
        int [] tower = {3,2,5,5,2,3};
        int ans = BeautifulTower(tower);
        System.out.println(ans);

    }
    public static int BeautifulTower(int[] tower){

        int peak = 0;

        Stack<Integer> stack = new Stack<>();

        for(int c:tower){
            stack.push(c);
            if(c> peak){
                peak = c;
            }
        }

        int end_height = 0;
        for(int i=0;i< tower.length;i++){
            int a = tower[i];

            int[] temparr = new int[tower.length];
            temparr[i] = a;
            for(int j=1;j< tower.length;j++){
                int b = tower[j];
                if(b<=a){
                    temparr[j] = tower[j];
                }
//                else if (b>a) {
//                    if()
//                }
            }
            System.out.println("tower with current peak " + Arrays.toString(temparr));
            int height =0;
            for(int c : temparr){
                 height += c;
            }

            System.out.println("height is "+ height);
            if(height>end_height){
                end_height = height ;
            }

        }
        System.out.println(stack);
        System.out.println(peak);
        System.out.println("answers issss   " + end_height);
        return 0;
    }
}
