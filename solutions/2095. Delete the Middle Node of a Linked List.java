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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
            return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        int mid=count/2;
        count=0;
        ListNode prev=null;
        while(temp!=null && (count++!=mid))
        {
            prev=temp;
            temp=temp.next;
        }
        if(prev!=null)
        prev.next=temp.next;
        else
            return null;
        return head;
    }
}
