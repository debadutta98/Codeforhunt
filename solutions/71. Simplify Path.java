class Solution {
    public String simplifyPath(String path) {
        String arr[]=path.split("/");
        Stack<String> stack=new Stack<>();
        Stack<String> p=new Stack<>();
        String result="/";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].trim().equals(".."))
            {
                if(!stack.isEmpty())
                {   
                      while(!stack.isEmpty() && stack.peek().trim().equals("."))
                      {
                          stack.pop();
                      }
                    if(!stack.isEmpty())
                        stack.pop();
                }
            }
            else if(arr[i]!="")
            {
                stack.push(arr[i]);
            }     
        }
        while(!stack.isEmpty())
        {
            String s=stack.pop();
            if(!s.trim().equals("."))
                p.push(s);
        }
        while(!p.isEmpty())
        {
            String s=p.pop();
            result+=(!p.isEmpty()?(s+"/"):(s));
        }
        return result;
    }
}
