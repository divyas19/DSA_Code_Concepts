class Solution
{
    Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node prev = head;
        Node cur = head.next;
        while(cur!= null)
        {
            Node nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        head.next = null;
        return prev;
        
    }
    Node compute(Node head)
    {
        // your code here
        
         if(head == null|| head.next == null)
        {
            return head;
        }
        
        Node reversed = reverse(head);
        Node rev =reversed;
        int max = rev.data;
        Node prev = rev;
        Node cur = rev.next;
        while(cur!= null)
        {
            if(cur.data<max)
            {
                prev.next = cur.next;
                cur=cur.next;
            }
            else
            {
                max = cur.data;
                prev = cur;
                cur = cur.next;
            }
        }
       Node ans = reverse(rev);
       return ans;
    }
    
}

//GFG
  
