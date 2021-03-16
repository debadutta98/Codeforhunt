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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        int c=0;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        temp=head;
        while(temp!=null && c!=n)
        {
            prev=temp;
            temp=temp.next;
               c--;
        }
        if(temp.next!=null)
        {
            if(temp==head)
            {
              head=head.next;
            }
            else
            {
               prev.next=temp.next;   
            }
        }
        else
        {
            if(temp==head)
            {
                head=null;
            }
            else if(temp.next==null)
            {
                prev.next=null;
            }
        }
        return head;
    }
}
