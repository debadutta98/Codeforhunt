                 int count=0;
                   for(int j=0;j<strs.length;j++)
                   {
                      if(j!=pos)
                      {
                          if(strs[j].charAt(i)==smalls.charAt(i))
                          {
                              count++;
                          }
                          else
                          {
                            return pref;
                          }
                      }
                   }
                   if(count==strs.length-1)
                   {
                    pref+=String.valueOf(smalls.charAt(i));   
                   }
               }
                return pref;
            }
            else
            {
                return smalls;
            }
        }
        else
        {
            return pref;
        }
    }
}
