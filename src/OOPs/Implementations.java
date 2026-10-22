package OOPs;

interface nithin{
    void doNithin();
}

interface umesh{
    void doUmesh();
}
class Akilan implements nithin,umesh{

    @Override
    public void doNithin(){

        System.out.println("Ommala nithin oru GAY" );
    }

    @Override
    public void doUmesh(){
        System.out.println("yella girls um GEETU mari illa machan");
    }

    public void doNithin(int speed,int gear){

    }
}
public class Implementations {
    public static void main(String[] args) {
        Akilan mass = new Akilan();
        mass.doNithin();
        mass.doUmesh();
    }
}
