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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(!q.isEmpty())
        {
            if(arr.size()>0)
            {
                arr.clear();
            }
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode ptr=q.remove();
                if(ptr.left!=null)
                {
                    q.add(ptr.left);   
                }
                if(ptr.right!=null)
                {
                    q.add(ptr.right);
                }  
                arr.add(ptr.val);
            }
        }
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
        }
        return sum;
    }
}
