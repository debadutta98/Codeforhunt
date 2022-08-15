class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int c=1;
        int count[]={1,0};
        int sum[]={grades[0],0};
        for(int i=1;i<grades.length;i++)
        {
            if(count[1]>count[0] && sum[1]>sum[0])
            {
                sum[0]=sum[1];
                count[0]=count[1];
                sum[1]=0;
                count[1]=0;
                c++;
            }
            sum[1]+=grades[i];
            count[1]++;
        }
        if(count[1]>count[0] && sum[1]>sum[0])
        {
            c++;
        }
        return c;
    }
}
