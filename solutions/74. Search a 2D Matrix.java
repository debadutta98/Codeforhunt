class Solution {
    public boolean searchElement(int[] arr,int target)
    {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target)
            {
             return searchElement(matrix[i],target);   
            }
        }
        return false;
    }
}
