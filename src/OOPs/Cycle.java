package OOPs;
// inheritance
class Cycle {
    int speed;
    int gear;


    public Cycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void applyBrake(int decr){
        speed -= decr;
    }

    public void applyAcc(int incr){
        speed -= incr;
    }

    @Override public String toString(){
        return("omalla speed is :" + " " + speed + "the gear on which the cycle is operating on" + gear);
    }
}

class MotorCycle extends Cycle{
    int height;

    public MotorCycle(int speed, int gear, int seat){
        super(speed, gear);
        height = seat;
    }

    public void setHeight(int newValue){
        height = newValue;
    }

    @Override public String toString(){
        return (super.toString() + " height is " + height );
    }
}

class Soln{
    public static void main(String[] args) {
        MotorCycle ome = new MotorCycle(78,4,8);
        System.out.println(ome.toString());
        ome.applyAcc(45);
        ome.applyBrake(41);
        System.out.println(ome.toString());
    }
}


