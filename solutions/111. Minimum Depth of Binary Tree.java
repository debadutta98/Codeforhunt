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
    Stack<Integer> stack=new Stack<Integer>();
    int min=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        stack.push(root.val);
        minDepth(root.left);
        if(root.left==null && root.right==null){if(min>stack.size())
        {
            min=stack.size();
        }}
        minDepth(root.right);
        stack.pop();
        return min;
    }
}
