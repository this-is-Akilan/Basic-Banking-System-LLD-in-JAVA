package Leetcode_Problems;

public class Leetcode455 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {2,1};

        int ans = assign(g,s);
        System.out.println(ans);
    }
    public static int assign(int[] g,int[] s ){

        int satisfied = 0;

        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(s[j]>=g[i]){
                    if(j==s.length-1){
                        satisfied++;
                    }
                }
            }
        }
        return satisfied;
    }
}


