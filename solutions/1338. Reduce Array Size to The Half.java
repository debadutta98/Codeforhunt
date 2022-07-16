class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<arr.length;i++)
      {
          if(map.containsKey(arr[i]))
          {
              int count=map.get(arr[i]);
              map.put(arr[i],count+1);
          }
          else
          {
              map.put(arr[i],1);
          }
      }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> ele:map.entrySet())
        {
            maxheap.add(ele.getValue());
        }
        int min=Integer.MAX_VALUE;
        int sum=maxheap.remove();
        int count=1;
        int half=(arr.length/2);
            if(sum>=half)
            {
                return 1;
            }
            else
            {
                 while(!maxheap.isEmpty())
                {
                if((sum+maxheap.peek())<half)
                {
                    sum+=maxheap.peek();
                    maxheap.remove();
                    count++;
                }
                else
                {
                    count++;
                    return Math.min(min,count);
                }   
                }
            }
    
        return min;
    }
}
