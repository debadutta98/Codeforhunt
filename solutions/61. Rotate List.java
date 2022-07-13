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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return null;
        }
        int length=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            ptr=ptr.next;
            length++;
        }
        int target=k;
        if(target>length)
        {
            while(target>length)
            {
                target-=length;
            }
        }
        if(target==0 || target==length)
        {
            return head;
        }
        else
        {
         int count=length;
         ptr=head;
        ListNode prev=null;
            while(ptr!=null && count!=target)
            {
                prev=ptr;
                ptr=ptr.next;
                count--;
            }  
            prev.next=null;
            ListNode root=ptr;
            while(ptr.next!=null)
                ptr=ptr.next;
            ptr.next=head;
            head=root;
            return head;
        }
    }
}
