package OOPs;
// abstraction;
abstract class Vehicles {
    abstract void acc();
    abstract void speed();

    void startEngine(){
        System.out.println("Engine started");
    }
}

class Car extends Vehicles{
    @Override
    void acc(){
        System.out.println("Car : car accelerate");
    }

    @Override
    void speed(){
        System.out.println("Car : car is speeding");
    }
}

class Main{
    public static void main(String[] args) {
        Vehicles panda = new Car();
        panda.startEngine();
        panda.acc();
        panda.speed();
    }
}
