class Solution {
    public int minFlips(String target) {
        int flip=0;
        int count=0;
        for(int i=0;i<target.length();i++)
        {
            if(i==0)
            {
                if(target.charAt(i)=='1')
                {
                    flip=0;
                    count++;
                }
                else
                {
                    flip=1;
                }
            }
            else
            {
                if(target.charAt(i)=='1' && flip==1)
                {
                    flip=0;
                    count++;
                }
                else if(target.charAt(i)=='0' && flip==0)
                {
                    flip=1;
                    count++;
                }
            }
        }
        return count;
    }
}
