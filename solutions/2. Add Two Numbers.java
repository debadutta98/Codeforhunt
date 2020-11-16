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
 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
           ListNode head=null;
     //oolean t=false;
    ListNode tail=null;
        ListNode temp=l1;
        ListNode temp1=l2;
        
        int size1=0,size2=0;
        while(temp!=null)
        {
            size1++;
            temp=temp.next;
            
        }
         while(temp1!=null)
        {
             size2++;
             temp1=temp1.next;
        
        }
       int sum=0;
        int value=0;
        if(size1>size2)
        {
         temp=l1;
            temp1=l2;
            while(temp1!=null)
            {
                if(temp1.val+temp.val+c>=10)
                {
                   sum=(temp1.val+temp.val+c)%10;
