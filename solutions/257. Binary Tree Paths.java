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
    Stack<String> stack=new Stack<String>();
    List<String> list=new ArrayList<String>();
    String s="->";
    String s1="";
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
            return list;
        if(!stack.isEmpty())
        s1=stack.peek()+s+String.valueOf(root.val);
        else
        s1=String.valueOf(root.val);
        stack.push(s1);
        binaryTreePaths(root.left);
        if(root.left==null && root.right==null)
            list.add(stack.peek());
        binaryTreePaths(root.right);
        stack.pop();
        return list;
    }
}
