class Solution {
    public int[] finalPrices(int[] prices) {
        if(prices.length==1)
        {
        return prices;
        }
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<prices.length;i++)
        {
            if(stack.isEmpty())
            {
               stack.push(i); 
            }
            else
            {
                while(!stack.isEmpty() && prices[stack.peek()]>=prices[i])
                {
                   prices[stack.peek()]-=prices[i];
                   stack.pop();
                }
                stack.push(i);
            }
        }
        return prices;
        }
}
