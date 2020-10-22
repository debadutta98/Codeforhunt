  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int c=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            if(q.peek()==null)
            {
               
                q.remove();
            }
            else
            {
                TreeNode node=q.remove();
                if(node!=null && node.left!=null)
                {
                    q.add(node.left);
                }
                if(node!=null && node.right!=null)
                {
                    q.add(node.right);
                }
                if(q.peek()==null)
                {
                    c++;
                    q.add(null);
                }
            }
        }
        return c;
    }
}
class MaxDepth
{
TreeNode root;
public static void main(String args[])
{
//create a tree
System.out.println(new Solution().MaxDepth(root));
}
}