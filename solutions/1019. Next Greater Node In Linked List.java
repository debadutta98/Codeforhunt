/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
       Stack<ListNode> stack=new Stack<>();
        int len=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            while(!stack.isEmpty() && stack.peek().val<ptr.val)
            {
                stack.pop().val=ptr.val;
            }
            stack.push(ptr);
            len++;
            ptr=ptr.next;
        }
        while(!stack.isEmpty())
        {
            stack.pop().val=0;
        }
        int arr[]=new int[len];
        int i=0;
        while(i<len)
        {
            arr[i++]=head.val;
            head=head.next;
        }
        return arr;
    }
}
