class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<Double,ArrayList<Integer>> map=new TreeMap<>();
        int res[][]=new int[k][2];
        for(int i=0;i<points.length;i++)
        {
                double distance=Math.sqrt((long)(((long)points[i][0]*(long)points[i][0])+((long)points[i][1]*(long)points[i][1])));
            if(map.containsKey(distance))
            {
                map.get(distance).add(i);
            }
            else
            {
              ArrayList<Integer> arr=new ArrayList<Integer>();  
                arr.add(i);
                map.put(distance,arr);
            }
        }
        int j=0;
        for(Map.Entry<Double,ArrayList<Integer>> ele:map.entrySet())
        {
            for(int p:ele.getValue())
            {
                if(j<k)
                {
                 res[j++]=points[p]; 
                }
                else
                {
                    return res;
                }
            }
        }
        return res;
    }
}
