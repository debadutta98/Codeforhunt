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
    int max=Integer.MIN_VALUE;
    int count=0;
    boolean valid=true;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return valid;
        isValidBST(root.left);
        if(max>=root.val && count>0)
        {
            valid=false;
            return valid;
        }else{
            max=root.val;
            count++;
        }
        isValidBST(root.right);
        return valid;
    }
}
