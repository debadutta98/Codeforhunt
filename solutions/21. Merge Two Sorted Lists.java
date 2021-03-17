 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode sortList(ListNode head)
    {
      ListNode temp=head;
      ListNode temp1;
        while(temp!=null)
        {
            temp1=temp.next;
            while(temp1!=null)
            {
                if(temp.val>temp1.val)
                {
                    int data=temp.val;
                temp.val=temp1.val;
                temp1.val=data;
               
                }
                 temp1=temp1.next;
                }
            temp=temp.next;
        }
        return head;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1==null && l2==null)
        {
            return null;
        }
        else if(l1!=null && l2==null)
        {
            return sortList(l1);
        }
        else if(l2!=null && l1==null)
        {
                 return sortList(l2);
        }
        else
        {
            ListNode head=l1;
            ListNode temp=l1;
            while(temp.next!=null)
            {
               temp=temp.next;
            }
            temp.next=l2;
            return sortList(head);
        }
    }
}
