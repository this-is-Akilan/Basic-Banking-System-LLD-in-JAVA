package OOPs;

class Copy {
    String name;
    int age;

    Copy(String name, int age){
        this.name = name;
        this.age = age;
    }

    Copy(Copy obj){
        this.name = obj.name;
        this.age = obj.age;
    }
}

class Geeks{
    public static void main(String[] args) {
        Copy panda1 = new Copy("Sudalai", 65);
        System.out.println("jafkj:" + panda1.name +  " " + panda1.age);

        Copy panda2 = new Copy("Anil" , 52);
        System.out.println("kajfkk" + panda2.name + " " + panda2.age);
    }
}
