package Leetcode_Problems;

public class Lemonade {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        boolean ans = lemonadeChange(bills);
        System.out.println(ans);
    }
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int num:bills){

            if(num == 5){
                five++;
            }
            else if (num == 10) {

                if(five == 0) return false;

                five--;
                ten++;
            }

            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else if(five >= 3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
