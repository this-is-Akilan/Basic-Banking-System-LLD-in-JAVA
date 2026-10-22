package LinkedList;
//
//class SLL {
//
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public void SLL() {
//        this.size = 0;
//    }
////    insertfirst
//    public void insertFirst(int val){
//        Node temp = new Node(val);
//        temp.next = head;
//        head = temp;
//        if(tail == null){
//            tail = head;
//        }
//        size++;
//    }
////    insertlast
//    public void insertLast(int val){
//
//        if(tail == null){
//            insertFirst(val);
//            return;
//        }
//        Node temp = new Node(val);
//        tail.next = temp;
//        tail = temp;
//        size++;
//    }
//
////    insert
//    public void insert(int val , int index){
//        if(index == 0){
//            insertFirst(val);
//            return;
//        }
//
//        if(index == size){
//            insertLast(val);
//            return;
//        }
//
//        Node temp = head;
//
//        for(int i = 1 ; i < index; i++){
//            temp = temp.next;
//        }
//        Node node = new Node(val , temp.next);
//        temp.next = node;
//        size++;
//    }
////    get
//    private Node get(int index){
//        Node temp = head;
//        for(int i = 0 ; i < index ; i++){
//            temp = temp.next;
//        }
//        return temp;
//    }
////    search
//    public void search(int val){
//
//        if(size<=1){
//            System.out.println(size);
//        }
//
//        Node temp = head;
//
//        for(int i = 0 ; i < size ; i++){
//            if(temp.val == val){
//                System.out.println(i);
//                break;
//            }
//            temp = temp.next;
//        }
//    }
//
////    deleteFirst
//    public void deleteFirst(){
//        head = head.next;
//        size--;
//    }
////    deleteLast
//    public void deleteLast(){
//        if(size <=1){
//            deleteFirst();
//        }
//        Node temp = get(size - 2);
//        int val = tail.val;
//        tail = temp;
//        tail.next = null;
//        size--;
//    }
//
////    delete
//    public void delete(int index){
//        Node temp = head;
//        for(int i = 0 ; i < index-1 ; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        size--;
//    }
//
////    size
//    public int size(){
//        return size;
//    }
//
////    display
//    public void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.val + "->");
//            temp = temp.next;
//        }
//        System.out.println("End");
//    }
//
//    private class Node{
//        int val;
//        Node next;
//
//        public Node(int val){
//            this.val = val;
//        }
//
//        public Node(int val , Node next){
//            this.val = val;
//            this.next = next;
//        }
//    }
//}

class SLL{
    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size = 0;
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

//    insert first
    public void insertFirst(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;

        if(tail == null){
            tail = head;
        }
        size++;
    }

//    insert last
    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }

//    insert
    public void insert(int val , int index){

        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;

        size++;
    }

//    deleteFirst
    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

//    delete last
    public void deleteLast(){

        if(size == 1){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;
        for(int i = 0 ; i < size - 2 ; i++){
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
    }

//    delete
    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }

        if(index == size - 1){
            deleteFirst();
            return;
        }

        Node prev = get(index - 1);
        prev.next = prev.next.next;

        size--;
    }

//    search
    public void search(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("invalid index :" + index);
        }
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        System.out.println(temp.val);;
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

//

//    display
    public void display(){
        Node temp = head;
        for(int i = 0 ; i < size ; i++){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

//    get
    private Node get(int index){
        Node temp = head;

        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }
}
