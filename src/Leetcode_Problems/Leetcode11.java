package Leetcode_Problems;

public class Leetcode11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(height.length);
        int ans = maxArea(height);
        System.out.println(ans);
    }
    public static  int maxArea(int[] height) {

        int area =0;

        for(int i=0;i< height.length;i++){
            int neck = height[i];

            for(int j=i + 1;j< height.length;j++){

                int length =j-i;

                int neckline = Math.min(neck,height[j]);

                int temp = neckline * length;

                if(temp>area) {
                    area = temp;
                }
            }
        }
        return area;
    }
}
