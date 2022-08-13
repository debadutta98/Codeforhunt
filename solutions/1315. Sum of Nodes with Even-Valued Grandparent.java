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
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null)return sum;
        sumEvenGrandparent(root.left);
        if(root.val%2==0)
            {
              if(root.left!=null)
            {
                sum+=root.left.left!=null?root.left.left.val:0;
                sum+=root.left.right!=null?root.left.right.val:0;
            }
            if(root.right!=null)
            {
                sum+=root.right.left!=null?root.right.left.val:0;
                sum+=root.right.right!=null?root.right.right.val:0;
            }   
            }
        sumEvenGrandparent(root.right);
        return sum;
    }
}
