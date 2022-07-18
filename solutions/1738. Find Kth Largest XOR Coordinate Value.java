class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                matrix[i][j]^=matrix[i][j-1];
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]^=matrix[i-1][j];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                pq.add(matrix[i][j]);
            }
        }
        while(!pq.isEmpty() && k-->1)
        {
            pq.remove();
        }
        if(pq.isEmpty())
        {
            return 0;
        }
        else
        {
            return pq.remove();
        }
    }
}
