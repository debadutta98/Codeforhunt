class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb=new StringBuilder("");
        while(n!=0)
        {
           int d=(k>=26)?26:k;
           while((k-d)<(n-1))
           {
               d--;
           }
            k-=d;
            sb.append(String.valueOf((char)(d+96)));
            n--;
        }
        return (sb.reverse().toString());
    }
}
