class Solution {
    public int divisorSubstrings(int num, int k) {
        System.out.println("-------------");
        int i=0;
        String s=String.valueOf(num);
        int count=0;
        while((i+k)<=s.length())
        {
            int div=Integer.parseInt(s.substring(i,(i+k)));
            System.out.println(div);
            if(div!=0 && num%div==0)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
