class Solution {
    
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val) count++;
        }
        int result=nums.length-count;
        for(int i=0;i<result;i++)
        {
            while(nums[j]==val)
            {
                j--;
            }
            if(nums[i]==val)
            {
               int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return result;
    }
}
