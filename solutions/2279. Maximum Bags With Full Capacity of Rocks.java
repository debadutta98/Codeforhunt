class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        int c=0;
        for(int i=0;i<capacity.length;i++)
        {
            int diff=(capacity[i]-rocks[i]);
            if(diff>0)
            {
             if(map.containsKey(diff))
            {
                int count=map.get(diff);
                map.put(diff,count+1);
            }
            else
            {
                map.put(diff,1);
            }   
            }
            else
            {
                c++;
            }
        }
        for(Map.Entry<Integer,Integer> ele:map.entrySet())
        {
            int i=ele.getValue();
            if((additionalRocks-(i*ele.getKey()))>=0)
            {
                additionalRocks-=(i*ele.getKey());
                c+=i;
                continue;
            }
            while(i-->0)
            {
                if(additionalRocks>0)
                {
                    if(ele.getKey()>0 && (additionalRocks-ele.getKey())>=0)
                    {
                        additionalRocks-=ele.getKey();
                        c++;
                    }
                    else{
                        return c;
                    }
                }else{
                    return c;
                }
            }
        }
        return c;
    }
}
