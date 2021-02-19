class Solution {
    public int reverse(int x) {
        String s=String.valueOf(x);
        boolean t=false;
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(i==0 && s.charAt(i)=='-')
            {
               t=true; 
                continue;
            }
            else
            {
              s1+=String.valueOf(s.charAt(i));
            }
            
        }
        try{
            int no=Integer.parseInt(s1);     
            if(t)
        {
            return -no;
        }
        else
        {
            return no;
        }
           }
        catch(Exception e)
        {
            return 0;
        }
    }
}
