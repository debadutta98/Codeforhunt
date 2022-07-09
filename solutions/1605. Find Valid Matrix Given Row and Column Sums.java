class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int mat[][]=new int[rowSum.length][colSum.length];
        for(int i=0;i<rowSum.length;i++)
        {
            for(int j=0;j<colSum.length;j++)
            {
                int min=Math.min(rowSum[i],colSum[j]);
                mat[i][j]=min;
                rowSum[i]-=min;
                colSum[j]-=min;
            }
        }
        return mat;
    }
}
