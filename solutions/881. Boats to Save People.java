class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int c=0;
        int i=0;
        int j=people.length-1;
        while(i<=j)
        {
            if((people[i]+people[j])<=limit)
            {
                i++;
                j--;
            }
            else
            {
                j--;
            }
            c++;
        }
        return c;
    }
}
