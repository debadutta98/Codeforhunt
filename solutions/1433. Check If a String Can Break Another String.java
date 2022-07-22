class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char ch[]=s2.toCharArray();
        char ch1[]=s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        int count1=0;
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
​
           if(ch1[i]>=ch[i])
           {
               count++;
           }
            if(ch1[i]<=ch[i])
            {
             count1++;   
            }
        }
        if(Math.max(count,count1)==s1.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
