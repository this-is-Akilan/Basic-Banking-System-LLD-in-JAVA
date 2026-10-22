package OOPs;

public class Dog {

    static String name;
    static String breed;
    static int age;

    static void set(String n,String b,int a){
        name = n;
        breed = b;
        age = a;
    }

    static void get(){
        System.out.println("name of the dog is :" + name);
        System.out.println("name of the breed is :" + breed);
        System.out.println("nage of the dog is:" + age);
    }

    public static void main(String[] args) {
        Dog.set("Tommy 👺" , "Sippiparai" , 5);
        Dog.get();
    }
}
