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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        int c=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            if(q.peek()==null)
            {
                 q.remove();
                //list.add(c,list1); 
                //list1.clear();
                c++;
            }
            else
            {
               TreeNode node=q.remove();
                list1.add(node.val);
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
                    list.add(c,list1); 
                    list1=new ArrayList<>();
                    q.add(null);
                }
            }
        }
        return list;
    }
}
class LeetCode
{
Public static void Main(String args[])
{
TreeNode root;
//create a tree and pass it to the fuction
//leetcode challange
Solution s=new Solution();
System.out.println(s.levelOrder(root);
}
}