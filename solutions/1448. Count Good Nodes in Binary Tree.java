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
    int c=0;
    public void findPath(TreeNode root,int max)
    {
        if(root==null)
        {
            return;
        }
        max=Math.max(max,root.val);
        if(root.val>=max)
        {
            c++;
        }
        findPath(root.left,max);
        findPath(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        findPath(root,root.val);
        return c;
    }
}
