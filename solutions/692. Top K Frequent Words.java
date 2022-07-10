class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list =new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        Map<Integer,TreeSet<String>> bucket=new TreeMap<>(Collections.reverseOrder());
        for(String s:words)
        {
            if(map.containsKey(s))
            {
                int count=map.get(s)+1;
                map.put(s,count);
            }
            else
            {
                map.put(s,1);
            }
        }
        for(Map.Entry<String,Integer> ele:map.entrySet())
        {
             TreeSet<String> set;
            if(bucket.containsKey(ele.getValue()))
            {
                 set=bucket.get(ele.getValue());
                set.add(ele.getKey());
                bucket.put(ele.getValue(),set);
            }
            else
            {
             set=new TreeSet<>();    
             set.add(ele.getKey());
                bucket.put(ele.getValue(),set);
            }
        }
        for(Map.Entry<Integer,TreeSet<String>> ele:bucket.entrySet())
        {
            
            if(k==0)
            {
                return list;
            }
            Iterator<String> itr = ele.getValue().iterator();
            while (k!=0 && itr.hasNext()) {
               list.add(itr.next());
                k--;
            }
        }
        return list;
    }
}
