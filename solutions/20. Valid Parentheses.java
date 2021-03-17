            else if(s.charAt(i)=='(')
            {
               stack.push("("); 
            }
            else if(s.charAt(i)=='[')
            {
                stack.push("[");
            }
            else if(s.charAt(i)=='}')
            {
               if(!stack.isEmpty())
               {
                   String v=stack.pop();
                   if(!v.equals("{"))
                   {
                        return false;
                   }
               }
              else
              {
                  return false;
              }
            }
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty())
               {
                   String v=stack.pop();
                   if(!v.equals("("))
                   {
                      return false; 
                   }
                    
               }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)==']')
            {
                if(!stack.isEmpty())
