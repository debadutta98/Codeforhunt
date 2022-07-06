class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]==0)
           {
               max=Math.max(max,count);
               count=0;
           }
           else
           {
               count++;
           }
       }
        max=Math.max(max,count);
        return max;
    }
}
