class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(a);
        q.add(b);
        q.add(c);
        int count=0;
        while(q.size()>1)
        {
            if(q.size()>2)
            {
            a=q.remove();
            b=q.remove();
            c=q.remove();
                a--;
                c--;
                if(a!=0)
                {
                    q.add(a);
                }
                if(b!=0)
                {
                    q.add(b);
                }
                if(c!=0)
                {
                    q.add(c);
                }
            }
            else
            {
                b=q.remove();
                c=q.remove();
                b--;
                c--;
                if(b!=0)
                {
                  q.add(b);  
                }
                if(c!=0)
                {
                 q.add(c);   
                }
            }
            count++;
        }
        return count;
    }
}
