class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[3];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            while(arr[n]==0)
            {
                n++;
            }
            nums[i]=n;
            arr[n]--;
        }
    }
}
