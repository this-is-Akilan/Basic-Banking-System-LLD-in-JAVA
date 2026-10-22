package CTS_Questions;

public class BitConversion {
    public static void main(String[] args) {
        int a = 42;
        System.out.println(gugugaga(a));
    }
    public static int gugugaga(int a ){
         String bin = String.format("%6s",Integer.toBinaryString(a)).replace(' ', '0');
         StringBuilder bubu = new StringBuilder(bin);
         int[] positions = {5,3,1};
         for(int pos : positions){
             int ind = bubu.length() - pos;
             char c = bubu.charAt(ind);
             bubu.setCharAt(ind, c == '0' ? '1' : '0');
         }
         return Integer.parseInt(bubu.toString(),2);
    }
}

//or just use this 2 line code

//public static int gugugaga(int a){
//    int swap = (1 << 0) | (1 << 2) | (1 << 4);
//    return a^swap;
//}