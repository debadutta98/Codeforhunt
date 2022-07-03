class Solution {
    public long maxRc(int[] arr,int l)
    {
        long MAX=arr[0];
        int i;
        for(i=1;i<arr.length;i++)
        {
            int diff=arr[i]-arr[i-1];
            MAX=Math.max(diff,MAX);
        }
        if(i==arr.length)
        {
                int final_diff=(l-arr[i-1]);
                MAX=Math.max(final_diff,MAX);
        }
        return MAX;
    }
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long mod = (long)1e9+7;
        long MAX_R=maxRc(horizontalCuts,h);
        long MAX_C=maxRc(verticalCuts,w);
        return (int)((MAX_R*MAX_C)%mod);
    }
}
