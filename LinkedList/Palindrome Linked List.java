/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverse(ListNode head) 
    {
        if(head== null|| head.next == null)
        return head;
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur!= null)
        {
            ListNode nex = cur.next;
            cur.next = prev;

            prev = cur;
            cur = nex;
        }
         head.next = null;
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

      if(head== null|| head.next == null)
        return true;

     ListNode temp = head;
     int ct =0;
     while(temp != null)
     {
         temp = temp.next;
         ct++;
     }
     ct++;
     int m =ct/2+1;

     ListNode t = head;
     int ind =1;
     while(t!= null && ind != m)
     {
         t=t.next;
         ind++;
     }
     ListNode r=reverse(t);
     ListNode l = head;

     while(r!= null && l!= null)
     {
         if(r.val != l.val)
         return false;
         r = r.next;
         l = l.next;
     }


     return true;

    }
}
