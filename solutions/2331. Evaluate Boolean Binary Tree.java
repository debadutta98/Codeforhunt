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
    public boolean evaluateTree(TreeNode root) {
        if(root.left!=null && root.right!=null){
         boolean leftval=evaluateTree(root.left);
         boolean rightval=evaluateTree(root.right);
         if(root.val==2)
         {
             return (leftval || rightval);
         }else{
           return (leftval && rightval);
         }
        }else{
            return (root.val==1?(true):(false));
        }
    }
}
