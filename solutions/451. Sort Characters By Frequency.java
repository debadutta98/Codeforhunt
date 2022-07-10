class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int count=map.get(s.charAt(i));
                map.put(s.charAt(i),(count+1));
            }
            else
            {
             map.put(s.charAt(i),1);   
            }
        }
        Map<Integer,ArrayList<String>> bucket=new TreeMap<>(Collections.reverseOrder());
        
        for(Map.Entry<Character,Integer> ele:map.entrySet())    
        {
            int rep=ele.getValue();
            ArrayList<String> arr;
            String str="";
            if(bucket.containsKey(rep))
            {
                arr=bucket.get(rep);
            }
            else
            {
                arr=new ArrayList<>();
            }
            while(rep>0)
            {
                str+=String.valueOf(ele.getKey());
                rep--;
            }
            arr.add(str);
            bucket.put(ele.getValue(),arr);
        }
        String result="";
        for(Map.Entry<Integer,ArrayList<String>> ele:bucket.entrySet())    
        {
            for(String str:ele.getValue())
            {
               result+=str; 
            }
        }
        return result;
    }
}
