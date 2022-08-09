class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:piles)
        {
            pq.add(n);
        }
        while(k-->0)
        {
            pq.add((int)Math.ceil((double)pq.remove()/2));
        }
        int sum=0;
        while(!pq.isEmpty())
        {
           sum+=pq.remove();
        }
        return sum;
        
    }
}
