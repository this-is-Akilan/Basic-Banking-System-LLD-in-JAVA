package OOPs;

class Cloning implements Cloneable {

    @Override
    protected Object clone()
        throws CloneNotSupportedException{
        return super.clone();
    }
    String name = "Panda";

    public static void main(String[] args) {
        Cloning obj = new Cloning();

        try{
            Cloning obj1 = (Cloning)obj.clone();
            System.out.println(obj1.name);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
