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
    boolean path=false;
    public void takeSum(TreeNode root,int val,int target)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            if((val+root.val)==target && root.left==null && root.right==null)
            {
                path=true;
                return;
            }
            else
            {
            takeSum(root.left,(val+root.val),target);
            takeSum(root.right,(val+root.val),target);     
            } 
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        takeSum(root,0,targetSum);
        return path;
    }
}
