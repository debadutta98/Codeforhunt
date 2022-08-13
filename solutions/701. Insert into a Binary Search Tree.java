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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            return new TreeNode(val);
        }
        TreeNode ptr=root;
        TreeNode prev=null;
        while(ptr!=null)
        {
            prev=ptr;
            if(ptr.val>val)
            {
                ptr=ptr.left;
            }
            else
            {
                ptr=ptr.right;
            }
        }
        if(prev.val<val)
        {
            prev.right=new TreeNode(val);
        }else{
            prev.left=new TreeNode(val);
        }
        return root;
    }
}
