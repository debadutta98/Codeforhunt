class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<Integer>();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int max=-1;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),i);
        }
        for(int i=0;i<s.length();i++)
        {
             if(map.get(s.charAt(i))>max)
            {
                max=map.get(s.charAt(i));
            }
            if(max==i)
            {
               list.add(max-start+1);
               start=i+1;
               max=-1;
            }
        }
        return list;
    }
}
