class Solution {
    public int largestAltitude(int[] gain) {
        int max=Math.max(0,gain[0]);
        for(int i=1;i<gain.length;i++)
        {
            max=Math.max(max,(gain[i]+gain[i-1]));
            gain[i]=gain[i]+gain[i-1];
        }
        return max;
    }
}
