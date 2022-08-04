class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        for(int i=1;i<arr.length;i++)
        {
               arr[i]=(arr[i-1]+arr[i]);
        }
        int sum=arr[arr.length-1];
        int sub=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+2;j<arr.length;j+=2)
            {
                sum+=(arr[j]-sub);
            }
            sub=arr[i];
        }
        return sum;
    }
}
