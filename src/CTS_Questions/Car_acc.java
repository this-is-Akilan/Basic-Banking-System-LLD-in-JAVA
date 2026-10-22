package CTS_Questions;

import java.util.*;

public class Car_acc {
    public static void main(String[] args) {
        int cars = 4;
        int[] speed = {2,4,1,3};
        int index = 3;
        double time = 0.1;
        System.out.println(carAcc(speed , index , time));
    }
    public static int carAcc( int[] speed , int index , double time){
        double totTime = time * 60;
        int wholeTime = (int) totTime;
        double fracTime = totTime - wholeTime;

        int carSpeed = speed[index - 1];

        int distane = carSpeed * wholeTime * (wholeTime +1) / 2 ;

        if(fracTime > 0){
            int newSpeed = carSpeed * (wholeTime +1);
            distane += (int) (newSpeed * fracTime);
        }
        return distane;
    }
}
