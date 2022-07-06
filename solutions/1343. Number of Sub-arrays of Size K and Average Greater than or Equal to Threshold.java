class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr.length<k)
        {
            return 0;
        }
        int init_sum=0;
        for(int i=0;i<k;i++)
        {
            init_sum+=arr[i];
        }
        int count=0;
        for(int i=k;i<arr.length;i++)
        {
            System.out.println(arr[i]+" "+init_sum);
            if((init_sum/k)>=threshold)
            {
            count++;
            }
            init_sum=init_sum+arr[i]-arr[i-k];
        }
        if((init_sum/k)>=threshold)
            {
            count++;
            }
        return count;
    }
}
