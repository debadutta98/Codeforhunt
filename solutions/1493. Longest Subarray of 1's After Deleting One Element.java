class Solution {
    public int longestSubarray(int[] nums) {
        System.out.println("----------");
        int j=0,i=0,countzero=0,max=0;
        boolean isDeleted=false;
        int c=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
                countzero++;
            while(countzero>1)
            {
                if(nums[i]==0)
                    countzero--;
                i++;
                isDeleted=true;
            }
          //  System.out.println(j+" "+i+" "+(j-i));
             max=Math.max(max,j-i);
            j++;
        }
        return isDeleted?max:nums.length-1;
    }
}
