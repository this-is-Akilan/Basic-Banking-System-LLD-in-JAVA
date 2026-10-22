package DSA;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    SinglyLinkedList(){
        this.size = 0;
    }

//  insertfirst

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = node;
        }
        size++;
    }

//    inserlast

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

//    insert

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }

        Node temp = head;

        for(int i = 0; i < index ; i++){
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;
    }

//    deletefirst

    public void deleteFirst(){
        head = head.next;
        size--;
    }

//    deleteLast

    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
        }

        Node node = get(size - 2);
        tail = node;
        tail.next = null;
        size--;
    }

//    delete

    public void delete(int index){
        Node node = head;

        for(int i = 0 ; i < index -1 ; i++){
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }

//    display

    public void display(){
        Node node = head;
        for(int i = 0 ; i < size ; i++){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("end");
    }

//    reverse

    public void reverse(){
        if(size < 2){
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;

            if(next != null){
                next = next.next;
            }
        }
        head = prev;

    }

//    middle element

    public void middle(){
        int node = get(size/2).val;
        System.out.println(node);
    }

//    sort

    public void sort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {

        if (row == 0) {
            return;
        }

        if (col < row) {

            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {
                // head swapping
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                // tail swapping
                else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = first;
                }
                // middle swapping
                else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            // continue......
            bubbleSort(row, col + 1);
        }
        else {
            bubbleSort(row - 1, 0);
        }
    }

//   merge
    public static SinglyLinkedList merge(SinglyLinkedList one , SinglyLinkedList two){
        Node f = one.head;
        Node s = two.head;

        SinglyLinkedList ans = new SinglyLinkedList();

        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(s.val);
                f = f.next;
            }
            else{
                ans.insertLast(f.val);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.val);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.val);
            s = s.next;
        }

        return ans;
    }


//    get

    private Node get(int index){
        Node node = head;
        for(int i = 0 ; i < index ; i++){
            node = node.next;
        }
        return node;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
    }
}
