package LinkedList;

import java.sql.SQLOutput;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public void size(){
        this.size = 0;
    }

//  insertfirst
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(tail == null){
            tail = node;
        }
        head = node;
        size++;
    }

//    inserlast
    public void insertLast(int value){
        Node node = new Node(value);
        node.next = null;
        node.prev = tail;
        if(tail == null){
            insertFirst(value);
        }
        tail = node;
        size++;
    }

//    insert
    public void insert(int after , int value){
        Node p = get(after);
        if(p == null){
            System.out.println("Not Found");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
        size++;

    }

//    get
    private Node get(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

//    deleteFirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
        }

        head = head.next;
        if(head != null){
            head.prev = null;
        }
        else{
            tail = null;
        }

        size--;
    }

//  deleteLast
    public void deleteLast(){
        if(tail == null){
            System.out.println("List is empty");
        }
        tail = tail.prev;
        if(tail != null){
            tail.next = null;
        }
        else{
            head = null;
        }
        size--;
}

//    delete
    public int delete(int value){
        Node node = get(value);
        if(node == null){
            System.out.println("Invalid");
            return -1;
        }
        if(node == head){
            deleteFirst();
            return value;
        }
        if(node == tail){
            deleteLast();
            return value;
        }
//        chain unlink
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return value;
    }


//  search
    public void search(int value){
        if(size <= 1){
            System.out.println(size);
        }
        Node node = head;
        for(int i = 0 ; i < size ; i++){
            if(node.value == value){
                System.out.println(i);
                break;
            }
            node = node.next;
        }
    }

//    display
    public void display(){
        Node node = head;
        for(int i = 0 ; i < size ; i++){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("End");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next , Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
