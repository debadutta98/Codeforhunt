class Solution {
    public void leftShift(int []nums,int from,int to,int pos)
    {
        if(from<to)
        {
           while(pos<to && from<to)
           {
               nums[from]=nums[pos];
               from++;
               pos++;
           }
        }
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)
        {
            return 1;
        }
        int count=0;
        int start=0;
        int len=nums.length;
        int num=nums[0];
        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==nums[nums.length-1])
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if(count>2)
        {
            len-=(count-2);
        }
        count=0;
        for(int i=0;i<len;)
        {
            if(nums[i]==num)
            {
                count++;
                i++;
            }
            else
            {
                if(count>2)
                {
                    leftShift(nums,start+2,len,i);
                    len-=(count-2);
                    i=start+2;
                    count=0;
                    start=i;
                }
                else
                {
                    start=i;
                    count=1;
                    num=nums[i];
                    i++;
                }
            }
        }
        
        return len;
    }
}
