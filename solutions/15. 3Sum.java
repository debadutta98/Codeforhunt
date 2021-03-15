class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> list=new ArrayList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
      {
            int k=nums.length-1;
          for(int j=i+1;j<nums.length && k>=0;)
          {
              List<Integer> addlist=new ArrayList<>();
              if(k>j && nums[i]+nums[j]+nums[k]==0)
              {
                  addlist.add(nums[i]);
                  addlist.add(nums[j]);
                  addlist.add(nums[k]);
                  if(!list.contains(addlist))
                  list.add(addlist);
                  j++;
              }
              else if(k>j && nums[i]+nums[j]+nums[k]<0)
              {
                  j++;
              }
              else if(k>j && nums[i]+nums[j]+nums[k]>0)
              {
                  k--;
              }
              else
              {
                  j++;
              }
          }
      }
        return list;
    }
}
