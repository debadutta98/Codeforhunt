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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
       TreeNode ptr=removeNodes(root,target);
        if(ptr.val==target && ptr.left==null && ptr.right==null)
        {
            return null;
        }
        else
        {
            return root;
        }
    }
    public TreeNode removeNodes(TreeNode root,int target)
    {
         if(root==null)
        {
            return root;
        }
        TreeNode leftchild=removeNodes(root.left,target);
        TreeNode rightchild=removeNodes(root.right,target);
        if(leftchild!=null && leftchild.left==null &&  leftchild.right==null && leftchild.val==target)
        {
            root.left=null;
        }
        if(rightchild!=null && rightchild.left==null &&  rightchild.right==null && rightchild.val==target)
        {
            root.right=null;
        }
        return root;
    }
}
