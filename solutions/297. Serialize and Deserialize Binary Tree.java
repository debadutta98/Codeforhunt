        else
        {
             Queue<TreeNode> q=new LinkedList<>();
                Queue<TreeNode> s=new LinkedList<>();
            for(int i=0;i<s1.length;i++)
            {
                
               if(!s1[i].equals("null"))
               {
                   
                  System.out.println(s1[i]);
                  
                TreeNode temp=new TreeNode(Integer.parseInt(s1[i]));
               q.add(temp);
               s.add(temp);
               }
                else
                {
                   s.add(null);
                }
            }
            if(!q.isEmpty())
            root=q.peek();
            if(!s.isEmpty())
            {
                s.remove();
            }
            while(!q.isEmpty())
            {
                TreeNode temp=q.remove();
              //  System.out.println(temp.val);
                if(!s.isEmpty())  
                {
                    temp.left=s.remove();
                    if(temp.left!=null)
                    System.out.println(temp.left.val);
                    temp.right=s.remove();
                }
            }
        }
        return root;
    }
}
​
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
