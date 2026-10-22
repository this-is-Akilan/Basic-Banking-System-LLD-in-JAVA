package LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insert(50,2);
        list.delete(2);
        list.reverse();
        list.display();
        list.search(3);
    }
}

class DLLMain{
    public static void main(String[] args) {
        DLL Dlist = new DLL();
        Dlist.insertFirst(12);
        Dlist.insertFirst(13);
        Dlist.insertFirst(14);
        Dlist.insertFirst(15);
        Dlist.insertFirst(16);
        Dlist.insert(2,17);
        Dlist.delete(13);
        Dlist.display();
        Dlist.search(12);

    }
}