        {
            if(count<=mid)
            {
                if(firstList==null)
                {
                  firstList=insertNode(firstList,temp.val);
                  rareFirst=firstList;
                }
                else
                {
                 rareFirst=insertNode(rareFirst,temp.val);   
                }
            }
            else
            {
                if(secondList==null)
                {
                    secondList=new ListNode(temp.val);
                }
                else
                {
                    ListNode ptr=new ListNode(temp.val);
                    ptr.next=secondList;
                    secondList=ptr;
                }
            }
            count++;
            temp=temp.next;
        }
        count=1;
        ListNode root=firstList;
        ListNode prev=null;
        while(root!=null)
        {
            if(count%2==1 && secondList!=null)
            {
                ListNode temp1=root.next;
                root.next=new ListNode(secondList.val);
                root.next.next=temp1;
                secondList=secondList.next;
            }
            else if(count%2==1 && secondList==null)
            {
                break;
            }
            prev=root;
            root=root.next;
            count++;
        }
    while(firstList!=null)
    {
        head.val=firstList.val;
        head=head.next;
       firstList=firstList.next;
    }
    }
}
