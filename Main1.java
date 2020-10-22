// Java program to print nodes at k distance from root 

/* A binary tree node has data, pointer to left child 
   and a pointer to right child */

import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Main1 {
    Node root;

    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
     */
        public List<Integer> inorderTraversal(Node root) {
            List<Integer> list = new ArrayList<Integer>();
            if (root == null)
                return list;
            Stack<Node> s = new Stack<Node>();
            Node curr = root;

            while (curr != null || s.size() > 0) {
                while (curr != null) {
                    s.push(curr);
                    curr = curr.left;
                }
                curr = s.pop();
                list.add(curr.data);
                curr = curr.right;
            }
            return list;
        }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        Main1 tree = new Main1();

        /*
         * Constructed binary tree is 1 / \ 2 3 / \ / 4 5 8
         */
        // tree.root = new Node(1);
        // tree.root.left = new Node(2);
        // tree.root.right = new Node(3);
        // tree.root.left.left = new Node(4);
        // tree.root.left.right = new Node(5);
        // tree.root.right.left = new Node(8);
        tree.root=new Node(3);
        tree.root.left=new Node(2);
        tree.root.left.right=new Node(1);
        tree.root.left.right.left=new Node(5);
        tree.root.left.right.right=new Node(3);

       System.out.println(tree.inorderTraversal(tree.root));
    }
}