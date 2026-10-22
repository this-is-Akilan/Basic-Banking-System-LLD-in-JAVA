package Leetcode_Problems;

public class Leetcode1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s,indices);
        System.out.println(ans);
    }
    public static  String restoreString(String s, int[] indices) {

        StringBuilder bubu = new StringBuilder();

        char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[indices[i]] = s.charAt(i);
        }

        for(char c: a){
            bubu.append(c);
        }

        return bubu.toString();
    }
}
