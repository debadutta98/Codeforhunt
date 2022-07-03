class Solution {
    public void sort(int[][] box)
    {
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<box.length;i++)
        {
            if(map.containsKey(box[i][1]))
            {
               ArrayList<Integer> arr=map.get(box[i][1]);
                arr.add(box[i][0]);
                map.put(box[i][1],arr);
            }
            else
            {
               ArrayList<Integer> arr=new ArrayList<>();
                arr.add(box[i][0]);
                map.put(box[i][1],arr);
            }
        }
        int index=0;
        for(Map.Entry<Integer,ArrayList<Integer>> ele: map.entrySet())
        {
            for(int key:ele.getValue())
            {
                box[index][0]=key;
                box[index][1]=ele.getKey();
                index++;
            }
        }
    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        sort(boxTypes);
        int sum=0;
        for(int i=0;i<boxTypes.length && truckSize>0;i++)
        {
            System.out.println(boxTypes[i][0]+" "+boxTypes[i][1]);
            if((truckSize-boxTypes[i][0])>=0)
            {
                truckSize-=boxTypes[i][0];
                sum+=(boxTypes[i][0]*boxTypes[i][1]);
            }
            else
            {
                sum+=(truckSize*boxTypes[i][1]);
                truckSize=0;
