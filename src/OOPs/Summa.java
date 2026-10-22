package OOPs;

import java.util.Scanner;

public class Summa {
    public String name;
    public int age;

//constructor

    public Summa(String name, int age){
        this.name = name;
        this.age = age;
    }
// getters method
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
//    setter method

    public void setName(){
        this.name = name;
    }
    public void setAge(){
        this.age = age;
    }

//    method to display the contents
    public void displayDetails(String header){
        System.out.println(header);
        System.out.println("ommala name ithan da " + getName());
        System.out.println("ommala yen vayasu than da " + getAge());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Summa ommala = new Summa(in.nextLine(),in.nextInt());
        ommala.displayDetails("my details");
    }
}
