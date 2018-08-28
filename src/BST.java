public class BST {


    public Node add(Node root, Node newNode){

        if(root == null){
            root = newNode;
            return root;
        }

        if(root.data.equals(newNode.data)){

        }

        


    }

    public static void main(String[] args) {


        BST myBst = new BST();

        myBst.add(null, new Node<Integer>(30));





    }
}
