    static void getSmall(TreeNode root)
    {
        if(root==null)
        {
        return ;
        }
        
            getSmall(root.left);
            s.add(root.val);
        getSmall(root.right);
        
    }
    /** @return the next smallest number */
    public int next() {
       // if(t)
        //{getSmall(root);t=false;}
    if(!s.isEmpty())
    return s.remove();
    else
    return root.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       if(!s.isEmpty())
       {
           return true;
       }
        else
        {
          return false;  
        }
    }
