package Trees;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        BST bst = new BST();
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        bst.populateSorted(nums);
//        bst.display();
//        System.out.println(bst.isBalanced());

        BT tree = new BT();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
