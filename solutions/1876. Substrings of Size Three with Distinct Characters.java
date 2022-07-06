class Solution {
    public boolean goodSubstring(String s)
    {
        return (s.charAt(1)!=s.charAt(0) && s.charAt(1)!=s.charAt(2) && s.charAt(0)!=s.charAt(2));
    }
    public int countGoodSubstrings(String s) {
        if(s.length()<=2)
        {
            return 0;
        }
        else
        {
            int count=0;
            int i=0;
            System.out.println("--------------");
            while((i+3)<=s.length())
            {
                System.out.println(s.substring(i,(i+3)));
                if(goodSubstring(s.substring(i,(i+3))))
                {
                    count++;
                }
                i++;
            }
            return count;
        }
    }
}
