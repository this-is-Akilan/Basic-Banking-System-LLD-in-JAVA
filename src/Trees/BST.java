package Trees;

class BST{

    private Node root;

    public class Node{

        private int value;
        private int height;
        private Node right;
        private Node left;


        public Node(int value){
            this.value = value;
        } }

        public int height(Node node){
            if(node == null) return -1;

            return node.height;
        }

//        insert

        public void insert(int value){
            root = insert(value , root);
        }

        private Node insert(int value , Node node){
            if(node == null){
                node = new Node(value);
                return node;
            }

            if(value < node.value){
                node.left = insert(value , node.left);
            }

            if(value > node.value){
                node.right = insert(value , node.right);
            }

            node.height = Math.max( height(node.left) , height(node.right)) + 1;

            return node;
        }

//        populate

        public void populate(int[] nums){
            for(int i = 0 ; i < nums.length ; i++){
                this.insert(nums[i]);
            }
        }

//        populate sorted array

        public void populateSorted(int[] nums){
            populateSorted(nums , 0 , nums.length);
        }

        private void populateSorted(int[] nums , int start , int end){
            if(start >= end) return;

            int mid = (start + end) /2;

            this.insert(nums[mid]);
            populateSorted(nums , start , mid);
            populateSorted(nums , mid+1 , end);
        }

//        balanced

        public boolean isBalanced(){
            return isBalanced(root);
        }

        private boolean isBalanced(Node node){
            if(node == null) return true;

            return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.right) && isBalanced(node.left);
        }


//        display

        public void display(){
            display(this.root , "root node is : ");
        }

        private void display(Node node , String text){
            if(node == null) return;

            System.out.println(text + node.value);
            display(node.left , "left child of " + node.value + " is : " );
            display(node.right , "right child " + node.value + " is : " );
        }
    }
