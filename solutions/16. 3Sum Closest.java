class Solution {
​
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++)
        {
            int k=nums.length-1;
            for(int j=i+1;j<nums.length && k>=0 && j<k;)
            {
​
                  if(Math.abs(sum-target)>Math.abs((nums[i]+nums[j]+nums[k])-target))
                  {
                      sum=nums[i]+nums[j]+nums[k];
                  }
                
                if(nums[i]+nums[j]+nums[k]<target)
                {
                 j++; 
                }
                else
                {
                    k--;
                }
            }
        }
return sum;
    }
​
}
