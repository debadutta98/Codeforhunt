class Solution {
    public int removeDuplicates(int[] nums) {
        int writeIndex = 0;
        for(int readIndex = 0; readIndex < nums.length; readIndex++) {
            if(readIndex > 0 && writeIndex > 0 && nums[readIndex] != nums[writeIndex - 1]) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            } else if(writeIndex == 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
