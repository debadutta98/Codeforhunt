class Solution {
​
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int count=map.get(nums[i]);
                map.put(nums[i],++count);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
       
        int arr[]=new int[k];
        TreeMap<Integer,TreeSet<Integer>> item=new TreeMap<>(Collections.reverseOrder());
        for(Map.Entry<Integer,Integer> ele:map.entrySet())
        {
           if(item.containsKey(ele.getValue()))
           {
              TreeSet set=item.get(ele.getValue());
              set.add(ele.getKey()); 
           }
            else
            {
                TreeSet set=new TreeSet();
                set.add(ele.getKey());
                item.put(ele.getValue(),set);
            }
        }
        int currentSize=0;
        for(Map.Entry<Integer,TreeSet<Integer>> ele:item.entrySet())
        {
            if(currentSize<=k-1)
            {
                 Iterator<Integer> itr=ele.getValue().iterator();  
                  while(itr.hasNext()){  
                    if(currentSize<=k-1)
                    arr[currentSize]=itr.next();
                    else
                    return arr;
                     currentSize++;
                  }  
            }
            else
            {
               return arr;
            }
        }
       return arr;
    }
}
