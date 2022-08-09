class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int n:nums)
        {
            pq.add(n);
        }
        for(int i=0;!pq.isEmpty();i++)
        {
            nums[i]=pq.remove();
        }
        return nums;
    }
}
