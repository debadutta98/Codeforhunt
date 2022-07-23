class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<temp.length;i++)
        {
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i])
            {
                 temp[stack.peek()]=(i-stack.peek());
                 stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            temp[stack.pop()]=0;
        }
        return temp;
    }
}
