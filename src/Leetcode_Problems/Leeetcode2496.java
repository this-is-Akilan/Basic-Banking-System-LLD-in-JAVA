package Leetcode_Problems;

public class Leeetcode2496 {
    public static void main(String[] args) {
        String[] strs = {"alic3", "bob", "3", "4", "00000"};
        int ans = maximumValue(strs);
        System.out.println(ans);
    }

    public static int maximumValue(String[] strs) {
        int max = 0;

        for (String s : strs) {
            int value;
            if (isNumber(s)) {
                value = Integer.parseInt(s);
            } else {
                value = s.length();
            }

            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    private static boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}