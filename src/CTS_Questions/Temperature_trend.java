package CTS_Questions;

import java.util.*;

public class Temperature_trend {
    public static void main(String[] args) {
        int k = 4;
        String s = "30C 30C 29C 28C 27C";
        System.out.println(temperatureTrend(k,s));
    }
    public static String temperatureTrend(int k, String s){
        String[] susu = s.split(" ");
        int[] hoho = new int[susu.length];
        for(int i = 0 ; i< susu.length ; i++){
            hoho[i] = Integer.parseInt(susu[i].replace("C" , ""));
        }

        int inc = 0;
        int dec = 0;

        for(int i = 1; i < susu.length ; i++){
            if(hoho[i] > hoho[i-1]){
                dec = i;
                if(i - inc + 1 == k){
                    return bubumama(hoho , inc , i);
                }
            }
            else if(hoho[i] < hoho[i-1]){
                inc = i;
                if(i - dec  + 1 == k){
                    return bubumama(hoho , dec , i);
                }
            }
            else{
                inc = dec = i;
            }
        }
        return "No valid trend found";
    }
    private static String bubumama(int[] hoho , int st , int end){
        StringBuilder bubu = new StringBuilder();
        for(int i = st ; i<= end ; i++){
            bubu.append(hoho[i]+"C" + " ");
        }
        return bubu.toString();
    }
}
