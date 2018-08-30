import java.util.Random;

public class BST {


    Node root;

    Node insertRec(Node root, int key){


        if (root == null) {
            root = new Node<>(key);
            return root;
        }
        if(key < (Integer)root.data){
            root.left = insertRec(root.left, key);
        } else if(key > (Integer) root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;


    }

    void insert(int key){
        root = insertRec(root, key);
    }

    void inOrderRec(Node root){

        if(root != null) {
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }

    void inOrder(){
        inOrderRec(root);
    }

    void postOrderRec(Node root){
        if(root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.data);
        }
    }

    void postOrder(){
        postOrderRec(root);
    }

    void countConections(){

    }






    public static void main(String[] args) {


        BST tree = new BST();



        tree.insert(4);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);

        tree.inOrder();



    }
}
