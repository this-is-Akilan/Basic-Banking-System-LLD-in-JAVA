import java.util.*;

//public class Occurence {
//    public static void main(String[] args) {
//        String input = "hello world";
//
//        input = input.replaceAll("\\s" , "").toLowerCase();
//
//        Map<Character , Integer> map = new LinkedHashMap<>();
//
//        for(char c : input.toCharArray()){
//            map.put(c , map.getOrDefault(c, 0) +1);
//        }
//
//        for(Map.Entry<Character , Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//
//    }
//}

public class Occurence{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
