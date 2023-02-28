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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode t = head;
        int size =0;
        while(t!=null)
        {
            size++;
            t = t.next;
        }

        int pos = size - n +1;
        int prevpos = size - n ;

        if(pos == 1 || head.next == null)
        {
            head = head.next;
            return head;
        }


        ListNode temp = head;
        int  ind =1;
        while(ind  < prevpos)
        {
          temp = temp.next;
           ind++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
