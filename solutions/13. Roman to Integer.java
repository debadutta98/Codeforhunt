class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map=new HashMap<>();
       map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int num=0;
        String s1="";
       for(int i=s.length()-1;i>=0;i--)
       {
          if(i==s.length()-1)
          {
           num=map.get(String.valueOf(s.charAt(i)));
          }
          else
          {
              if(map.get(s1)>map.get(String.valueOf(s.charAt(i))))
              {
                  num-=map.get(String.valueOf(s.charAt(i)));
              }
              else
              {
                  num+=map.get(String.valueOf(s.charAt(i)));
              }
          }
           s1=String.valueOf(s.charAt(i));
       }
        return num;
    }
}
