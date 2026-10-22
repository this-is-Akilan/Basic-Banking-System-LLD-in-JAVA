package Leetcode_Problems;

public class Leetcode1021 {
    public static void main(String[] args) {
        String s= "()()";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }
    public static  String removeOuterParentheses(String s) {

        StringBuilder oombu = new StringBuilder();
//        ( = ++
//        ) = --
        int count =0;
        for(char c:s.toCharArray()){

            if(c=='('){
                if(count>0){
                    oombu.append(c);
                }
                count++;
            }
            else if(c==')'){
                count--;

                if(count>0){
                    oombu.append(c);
                }
            }

            if(oombu.isEmpty()){
                return "\"\"";
            }
        }
        return oombu.toString();
    }
}
