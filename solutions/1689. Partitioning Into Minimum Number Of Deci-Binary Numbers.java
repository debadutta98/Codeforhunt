class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++)
        {
            int value=Integer.parseInt(n.substring(i,i+1));
            if(max<value)
            {
                max=value;
            }
        }
        return max;
    }
}
