            head=ptr;
        }
        return head;
    }
    public void reorderList(ListNode head) {
       ListNode firstList=null;
        ListNode secondList=null;
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        int mid=count%2==0?(count/2):((count+1)/2);
        count=1;
        ListNode rareFirst=null,rareSecond=null;
        while(temp!=null)
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
