import java.util.*;

public class Non_repeating_character {
    public static void main(String[] args) {
        String input = "akilan";
        System.out.println(firstNonRepeating(input));
    }
    public static char firstNonRepeating(String input){
        Map<Character , Integer> map = new HashMap<>();
        for(char c :input.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }
        for(char c : input.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return '-';
    }

}
