class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGas=0;
        int totalGas=0;
        int station_to_start=0;
        for(int i=0;i<gas.length;i++)
        {
            currentGas+=gas[i]-cost[i];
            totalGas+=gas[i]-cost[i];
            if(currentGas<0)
            {
                currentGas=0;
                station_to_start=i+1;
            }
        }
        if(totalGas<0)
        {
            return -1;
        }
        else
        {
            return station_to_start;
        }
    }
}
