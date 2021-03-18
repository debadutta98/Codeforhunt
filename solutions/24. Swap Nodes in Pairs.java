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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        {
           return null; 
        }
        else
        {
          ListNode temp1=head.next;
          ListNode temp=head;
            while(temp1!=null)
            {
                int data=temp1.val;
                temp1.val=temp.val;
                temp.val=data;
                temp=temp1.next;
                if(temp==null || temp.next==null)
                {
                    temp1=null;
                }
                else
                {
                    temp1=temp.next;
                }
            }
          return head;
        }   
    }
}
