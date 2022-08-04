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
    public int pairSum(ListNode head) {
        Stack<Integer> stack=new Stack<Integer>();
        int c=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            c++;
            ptr=ptr.next;
        }
        int i=0;
        int max=Integer.MIN_VALUE;
        while(head!=null)
        {
            if(i<(c/2))
            {
              stack.push(head.val);  
            }
            else
            {
                max=Math.max(max,(stack.pop()+head.val));
            }
            i++;
            head=head.next;
        }
        return max;
    }
}
