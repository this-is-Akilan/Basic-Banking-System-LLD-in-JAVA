package Oct2;

public class Multi {
    public static void main(String[] args) {
        int a = -3;
        int b = 4;
        int min = 0;

        for(int i = 0 ; i < Math.abs(b); i++){
            min += a;
        }
        if(a < 0 && b <0){
            System.out.println(Math.abs(min));
        }
        else{
            System.out.println(min);
        }
    }

}
