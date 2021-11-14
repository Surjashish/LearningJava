package DataStructures.BinaryTree;

class Node {
    int data;
    Node left;
    Node right;

}

public class BST {
    Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    public Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }
        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data)
            node.right = insert(node.right, val);


        return node;
    }
    public Node delete(Node node, int val)
    {
        if (node == null)
            return null;
        if (val < node.data)
            node.left = delete(node.left,val);
        else if(val > node.data)
            node.right = delete(node.right,val);
        else
        {
            if (node.left == null || node.right == null){
                Node temp = null;
                temp = node.left == null? node.right : node.left;

                if (temp == null){
                    return null;
                }
                else
                    return node;
            }
            else {
                //if both child are there, replace with inorder successor
                Node successor = getSuccessor(node); //get inorder successor
                node.data = successor.data;
                node.right=delete(node.right,4);
                return node;
            }
        }
        return node;
    }

    private Node getSuccessor(Node node) {
        if (node == null)
            return null;
        Node temp = node.right;
        while (temp != null){
            temp = temp.left;
        }
        return temp;
    }
}

class BSTApp {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 1);
        root = a.insert(root, 5);
        root = a.insert(root, 14);
        root = a.insert(root, 13);




    }
}
