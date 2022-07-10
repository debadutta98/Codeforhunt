class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        {
            return 0;
        }
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int j=0;
        for(Map.Entry<Integer,Integer> ele:map.entrySet())
        {
                int count=ele.getValue();
                while(count!=0)
                {
                    nums[j]=ele.getKey();
                    count--;
                    j++;
                }
        }
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,(nums[i-1]-nums[i]));
        }
        return max;
    }
}
