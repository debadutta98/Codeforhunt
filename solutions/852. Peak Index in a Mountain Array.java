class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
           if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
           {
               return mid;
           }else if(arr[mid-1]>=arr[mid]){
               r=mid;
           }else{
               l=mid;
           }
        }
        return 0;
    }
}
