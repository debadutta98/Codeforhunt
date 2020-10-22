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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> q=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
return list;
        }
        q.push(root);
        while(!q.isEmpty())
        {
            TreeNode node=q.pop();
            list.add(node.val);
            if(node!=null && node.right!=null)
                q.push(node.right);
            if(node!=null && node.left!=null)
                q.push(node.left);
        }
        return list;
    }
}
class LeetCode1
{
public static void Main(String args[])
{
TreeNode root;
//create a Binary Tree
//leet Code challage
System.out.print(new Solution().preorderTraversal(root));
}
}