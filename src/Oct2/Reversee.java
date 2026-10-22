package Oct2;

import java.util.*;

public class Reversee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputstr = in.nextLine();
        String[] arr = inputstr.split(" ");
        System.out.println(Arrays.toString(arr));
        StringBuilder aaa = new StringBuilder();
        for(int i = arr.length-1 ; i >= 0 ; i--){
            aaa.append(arr[i] + " ");
        }
        System.out.println(aaa);
    }
}
