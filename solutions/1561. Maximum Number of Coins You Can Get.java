class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        int shift=2;
        for(int i=0;i<(piles.length/3);i++)
        {
            sum+=piles[piles.length-shift];
            shift+=2;
        }
        return sum;
    }
}
