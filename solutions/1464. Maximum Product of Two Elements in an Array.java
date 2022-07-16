class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
           queue.add((nums[i]-1)); 
        }
        
        return (queue.remove()*queue.remove());
    }
}
