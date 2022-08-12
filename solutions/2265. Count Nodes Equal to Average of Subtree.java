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
    int count=0;
    public void compute(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        int c=0;
        int sum=0;
        while(!stack.isEmpty())
        {
            c++;
            TreeNode node=stack.pop();
            sum+=node.val;
            if(node.left!=null)
            {
                stack.push(node.left);
            }
            if(node.right!=null)
            {
                stack.push(node.right);
            }
        }
        if((sum/c)==root.val)
        {
            count++;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode ptr=q.remove();
            compute(ptr);
            if(ptr.left!=null)
            {
                q.add(ptr.left);
            }
            if(ptr.right!=null)
            {
                q.add(ptr.right);
            }
        }
        return count;
    }
}
