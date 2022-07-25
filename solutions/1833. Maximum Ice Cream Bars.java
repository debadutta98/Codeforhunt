class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int count=0;
        while(i<costs.length)
        {
            if((coins-costs[i])>=0)
            {
                coins-=costs[i];
                count++;
            }
            else
            {
                break;
            }
            i++;
        }
        return count;
    }
}
