package DataStructures.BinaryTree.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data; //Generic Type

        public TreeNode(int data){
            this.data = data;

        }
    }
    BinaryTree(TreeNode root)
    {
        this.root=root;
    }

    public  BinaryTree createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode sec = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = sec;
        first.right = third;

        sec.left= forth;
        sec.left.left = fifth;
        return new BinaryTree(root);

    }
    public void preOrder(TreeNode node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
//    public List<Integer> inorder(TreeNode root)
//    {
//        Stack<TreeNode> stack = new Stack<>();
//        List<Integer> outputList = new ArrayList<>();
//        if (root == null)
//            return outputList;
//        TreeNode curr = root;
//        while(curr != null || !stack.isEmpty()){
//            while (curr != null){
//
//            }
//        }
//
//
//    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(null);
        bt=bt.createBinaryTree();
        bt.preOrder(bt.root);
    }
}
