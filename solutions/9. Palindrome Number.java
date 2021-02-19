class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s=new StringBuilder();
        s.append(String.valueOf(x));
        if(String.valueOf(x).equals(String.valueOf(s.reverse())))
        {
            return true;
        }
        else
        {
            return false;
        }
           
    }
}
