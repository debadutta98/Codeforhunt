class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        boolean visit=false;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
              if(i==j || (i+j==mat.length-1))  
              {
                  if(i==j && (i+j==mat.length-1) && !visit)
                  {
                      sum+=mat[i][j];
                      visit=true;
                  }
                  else if ((i==j && (i+j==mat.length-1) && visit))
                  {
                      continue;
                  }
                  else
                  sum+=mat[i][j];
              }
            }
        }
​
        return sum;
    }
}
