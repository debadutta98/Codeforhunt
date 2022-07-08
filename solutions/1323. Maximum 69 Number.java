class Solution {
    public int maximum69Number (int num) {
        int max=-1;
        for(int i=0;i<String.valueOf(num).length();i++)
        {
            StringBuilder sb=new StringBuilder(String.valueOf(num));
            sb.replace(i,i+1,"9");
            max= Math.max(max,Integer.valueOf(sb.toString()));
        }
        return max;
    }
}
