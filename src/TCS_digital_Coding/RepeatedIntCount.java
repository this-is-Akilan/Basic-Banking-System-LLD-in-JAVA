package TCS_digital_Coding;

import java.util.*;

public class RepeatedIntCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(find(n1, n2));
    }
    public static int find(int n1,int n2){

        int count = 0;

        for(int i = n1; i <= n2; i++){
            int num = i;
            boolean[] visited = new boolean[10];
            if(visited[num % 10]){
                break;
            }
            visited[num%  10] = true;

        }
        return count;
    }
}
