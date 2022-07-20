class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                if((nums[i]+nums[mid])==target)
                {
                    arr[0]=i+1;
                    arr[1]=mid+1;
                    return arr;
                }
                else if((nums[i]+nums[mid])>target)
                {
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            }
        return arr;
    }
}
