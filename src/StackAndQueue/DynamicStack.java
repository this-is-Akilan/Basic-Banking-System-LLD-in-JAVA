package StackAndQueue;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int num){
        if(isFull()){
            int[] temp = new int[data.length * 2];
            for(int i = 0 ; i < temp.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

//        from here on its the same as the custom stack operation,
//        so just call it from there
        return super.push(num);
    }
}
