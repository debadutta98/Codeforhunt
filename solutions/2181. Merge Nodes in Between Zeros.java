        }
    }
    public ListNode mergeNodes(ListNode head) {
        ListNode ptr=head;
        int sum=0;
        while(ptr!=null)
        {
            if(ptr.val==0)
            {
                if(sum!=0)
                {
                  insert(sum);
                }
                sum=0;
            }
            else
            {
               sum+=ptr.val; 
            }
            ptr=ptr.next;
        }
        return root;
    }
}
