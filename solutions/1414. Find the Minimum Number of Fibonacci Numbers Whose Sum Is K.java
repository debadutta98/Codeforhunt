class Solution {
    public int findMinFibonacciNumbers(int k) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(1);
        int last=1;
        while((stack.peek()+last)<=k)
        {
            int a=stack.peek();
            stack.push(a+last);
            last=a;
        }
        int sum=0;
        int c=0;
        while(sum<k)
        {
            if((sum+stack.peek())<=k)
            {
                sum+=stack.pop();
                c++;
            }
            else
            {
                stack.pop();
            }
        }
        return c;
    }
}
