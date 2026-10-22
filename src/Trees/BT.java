package Trees;

import java.util.*;

class BT {
    private class Node{
        int value;
        Node right;
        Node left;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

//    populate
    public void populate(Scanner scanner){
        System.out.println("Enter the root value : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner , root);
    }

    private void populate(Scanner scanner , Node node){
        System.out.println("want to enter a value on left ?");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("enter the left node value : ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner , node.left);
        }

        System.out.println("want to enter value on the right ?");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the right node value : ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner , node.right);
        }
    }

//    display

    public void display(){
        display(this.root , " ");
    }

    private void display(Node node , String gap){
        if(node == null){
            return;
        }
        System.out.println(gap + node.value);
        display(node.left , gap + "\t");
        display(node.right , gap + "\t");
    }

    public void postOrder(){
//        left right root
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    public void preOrder(){
//        root right left
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null) return;

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
//        left root right
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null) return;

        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }
}
