package OOPs;

public class Autumn {
    void season(){
        System.out.println("ithu ommala koodai kaalam");
    }

    void month(){
        System.out.println("ommala ithu 7am maasam");
    }

    public class Summer extends Autumn {
        void leave(){
            System.out.println("Unaku avlo tha mariyathai ");
        }
    }

    public static void main(String[] args) {
        Autumn  eeh = new Autumn();

        eeh.month();
        eeh.season();
    }
}
