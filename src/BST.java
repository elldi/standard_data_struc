import java.util.Random;

public class BST {


    Node root;

    public Node insertRec(Node root, int key){


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

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void inOrderRec(Node root){

        if(root != null) {
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }

    public void inOrder(){
        inOrderRec(root);
    }




    public static void main(String[] args) {


        BST tree = new BST();



        for(int x = 0 ;x < 10; x ++){

            tree.insert(new Random().nextInt());
        }

        tree.inOrder();




    }
}
