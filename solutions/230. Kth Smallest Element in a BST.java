/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) 
    {
        TreeNode node;
        Stack<TreeNode> s=new Stack<>();
        //s.push(root);
        if(root==null)
        {
            return 0;
        }
        node=root;
        int c=0;
        TreeNode node1=root;
        while(node!=null || s.size()>0)
        {
            if(c==k)
            { 
                return node1.val;
            }
            while(node!=null)
            {
                s.push(node);
                node=node.left;
            }
            node=s.pop();
             node1=node;
            System.out.println(node.val);
            node=node.right;
            c++;
        }
        if(node==null)
        {return node1.val;}
        return node.val;
    }
}
