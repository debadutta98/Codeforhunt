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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode temp=p;
        TreeNode temp1=q;
        ArrayList<TreeNode> f1=new ArrayList<TreeNode>();
        ArrayList<TreeNode> f2=new ArrayList<TreeNode>();
        Stack<TreeNode> s=new Stack<TreeNode>();
        if(p!=null)
        { 
        s.push(p);
         f1.add(p);
        }
        while(!s.isEmpty())
        {
            TreeNode tree=s.pop();
            f1.add(tree.left);
            f1.add(tree.right);
            if(tree.left!=null)
            s.push(tree.left);
            if(tree.right!=null)
            s.push(tree.right);
        }
        while(!s.isEmpty())
        {
            s.pop();
        }
        if(q!=null)
        {
        s.push(q);
        f2.add(q);
        }
        while(!s.isEmpty())
        {
            TreeNode tree=s.pop();
            f2.add(tree.left);
            f2.add(tree.right);
            if(tree.left!=null)
            s.push(tree.left);
            if(tree.right!=null)
            s.push(tree.right);
        }
        if(f1.size()==f2.size())
        {
