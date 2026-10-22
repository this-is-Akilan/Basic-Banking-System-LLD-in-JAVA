package StackAndQueue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    int ptr = 0;

//    push
    public boolean push(int num){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[ptr] = num;
        ptr++;

        return true;
    }

//    pop
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }

        return data[--ptr];
    }
//    peek
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }

        return data[ptr - 1];
    }

    public boolean isFull() {
        return ptr == data.length;
    }

    public boolean isEmpty(){
        return ptr == 0;
    }
}
