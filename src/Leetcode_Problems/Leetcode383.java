package Leetcode_Problems;

public class Leetcode383 {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";

        StringBuilder mag = new StringBuilder(magazine);
        StringBuilder ans = new StringBuilder();

        for (char ch : ransomNote.toCharArray()) {
            int index = mag.indexOf(String.valueOf(ch));
            if (index != -1) {
                ans.append(ch); // Remove first occurrence
            }
        }
        System.out.println(ans);

        if(magazine.contains(ransomNote)){
            System.out.println(true);
        }
        else{
            if(ransomNote.contains(ans)){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }

    }
}
