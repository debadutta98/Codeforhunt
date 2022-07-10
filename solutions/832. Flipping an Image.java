class Solution {
    public void swap(int []mat,int k,int j)
    {
        int temp=mat[k];
        mat[k]=mat[j];
        mat[j]=temp;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int k=0,j=(image.length-1);
            while(k<=j)
            {
                if(k!=j){
                image[i][k]=image[i][k]^1;
                image[i][j]=image[i][j]^1;
                }
                else
                {
                    image[i][k]=image[i][k]^1;
                }
                swap(image[i],k,j);
                k++;
                j--;
            }
        }
        return image;
    }
}
