            while(!s1.isEmpty() || !s2.isEmpty())
            {
                l=new ArrayList<>();
                while(!s1.isEmpty())
                {
                TreeNode t2=s1.pop();
                   // if(t2==root)
                   // {
                   //     bool=false;
                   // }
                if(t2.left!=null)
                {
                    s2.add(t2.left);
                }
                if(t2.right!=null)
                {
                s2.add(t2.right);
                }
                System.out.println(t2.val+"ho");
                if(t2!=root)
                l.add(t2.val);
                }
               // if(bool){
                if(l.size()>0)
                list.add(l);
                l=new ArrayList<>();
                while(!s2.isEmpty())
                {
                  //  l=new ArrayList<>();
                TreeNode t2=s2.pop();
                if(t2.right!=null)
                {
                    s1.add(t2.right);
                }
                if(t2.left!=null)
                {
                s1.add(t2.left);
                }
                System.out.println(t2.val);
                l.add(t2.val); 
                }
               // }
                //bool=true;
                if(l.size()>0)
                list.add(l);
            }
        }
        return list;
    }
}
