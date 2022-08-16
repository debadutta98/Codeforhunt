class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        Queue<Character> q=new LinkedList<>();
        int opening=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                    opening--;
                   // System.out.println(opening+" "+stack);
                    while(stack.peek()!='(')
                    {
                        if(opening==0)
                        {
                            str+=String.valueOf(stack.pop());     
                        }
                        else
                        {
                            q.add(stack.pop());   
                        }
                    } 
                    stack.pop();
            }else{
                if(s.charAt(i)=='(')
                {
                    opening++;
                }
                if(opening==0)
                {
                    str+=String.valueOf(s.charAt(i));
                }else{
                    stack.push(s.charAt(i));   
                }
            }
            while(!q.isEmpty())
            {
                    stack.push(q.remove());
            }
        }
        return str;
    }
}
