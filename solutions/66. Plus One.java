class Solution {
    
    public int[] getResult(int []digits,int n,int carry)
    {
        if(n==0)
        {
           if(carry==1)
           {
                if(digits[0]+1>=10)
                {
                    int arr[]=new int[digits.length+1];
                    arr[0]=1;
                    arr[1]=0;
                    if(arr.length>2)
                    {
                     System.arraycopy(digits,1,arr,2,digits.length-1);   
                    }
                    return arr;
                }
               else
               {
                   ++digits[n];
               }
           }
            return digits;
        }
        int num=digits[n]+carry;
        System.out.println(num);
        if(num>=10)
        {
            carry=1;
            digits[n]=0;
        }
        else
        {
            digits[n]=num;
            carry=0;
        }
        return getResult(digits,--n,carry);
        
    }
    public int[] plusOne(int[] digits) {
    return getResult(digits,digits.length-1,1);   
    }
}
