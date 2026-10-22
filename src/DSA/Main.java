package DSA;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll.insertFirst(16);
        sll.insertFirst(2);
        sll.insertFirst(21);
        sll.insertFirst(14);
        sll.insertFirst(45);
        sll.insertFirst(12);
        sll.insertFirst(4);
        sll.insertFirst(80);
        sll.insertFirst(88);
        sll.insertFirst(555);
        sll.insertFirst(689);
        sll.insertFirst(99);
//        sll.reverse();
//        sll.sort();
        sll.display();
        sll.middle();
        SinglyLinkedList.merge(sll, sll2);

    }
}
