class Solution {
    public int invert(int arr[],int index)
    {
        return ((arr[index]==0)?(1):(0));
    }
    public void swap(int []mat,int k,int j)
    {
        int temp=mat[k];
        mat[k]=mat[j];
        mat[j]=temp;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int k=0,j=image.length-1;
            while(k<=j)
            {
                if(k!=j){
                image[i][k]=invert(image[i],k);
                image[i][j]=invert(image[i],j);}
                else
                {
                    image[i][k]=invert(image[i],k);
                }
                swap(image[i],k,j);
                k++;
                j--;
            }
        }
        return image;
    }
}
