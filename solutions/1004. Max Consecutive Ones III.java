class Solution {
    public int longestOnes(int[] nums, int k) {
    System.out.println("------------");
       int i=0,j=0,max=Integer.MIN_VALUE,zerocount=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                zerocount++;
            }
            while(zerocount>k)
            {
                if(nums[i]==0)
                    zerocount--;
                i++;
            }
            System.out.println(j+" "+i+" "+(j-i+1));
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
