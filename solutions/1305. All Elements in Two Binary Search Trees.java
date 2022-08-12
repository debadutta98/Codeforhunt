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
    List<Integer> list=new ArrayList<>();
    public TreeNode insertNode(TreeNode root1,TreeNode root2)
    {
           if(root2==null)
           {
               return root1;
           }
           insertNode(root1,root2.left);
           int val=root2.val;
           TreeNode ptr=root1;
           TreeNode prev=null;
           while(ptr!=null)
           {
                prev=ptr;
                if(ptr.val>val)
                {
                    ptr=ptr.left;   
                }else{
                    ptr=ptr.right;
                }
           }
           if(prev.val>val)
           {
               prev.left=new TreeNode(val);
           }else{
               prev.right=new TreeNode(val);
           }
          insertNode(root1,root2.right);
        return root1;
    }
    public void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        TreeNode root;
        if(root1==null && root2==null)
        {
         return list;   
        }else if(root1!=null)
        {
           root=insertNode(root1,root2);
        }else{
           root=insertNode(root2,root1);
        }
        inorder(root);
        return list;
    }
}
