class Solution {
    public int partitionArray(int[] nums, int k) {
        //System.out.println("-----");
        if(nums.length==1)
        {
            return 1;
        }
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;)
        {
           // System.out.println(i);
            // if(i+1>=n)
            // {
            //     count++;
            //     return count;
            // }
            int j;
            int prevIndex=i;
            for(j=i+1;j<n;j++)
            {
                if((nums[j]-nums[i])>k)
                {
                    i=j;
                    break;
                }
                else if(j==i+1 && (nums[j]-nums[i])>k)
                {
                    i=j;
                    break;
                }
            }
            if(nums[j-1]-nums[prevIndex]<=k)
                count++;
            if(j==nums.length)
            {
                return count;
            }
        }
        return count;
    }
}
