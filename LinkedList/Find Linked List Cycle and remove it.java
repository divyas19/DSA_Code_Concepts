/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
   ListNode fast = head;
  
   while(fast != null && fast.next != null) 
   {
       slow = slow.next;
       fast = fast.next.next;
      
       if(fast == slow) 
       {
           fast = head;

           while(fast != slow)
           {
               fast = fast.next ;
               slow = slow.next;
           }
           return fast;
          
       }
   }
  
   return null;
    }
}

______________________________________________________________________________________________________________

public void DetectandRemoveCycle(Node head) {
    Node slow = head;
    Node fast = head;
  
    // Detect the cycle and find the meeting point
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      
        if (fast == slow) {
            System.out.println("Loop exists");
            
            // Reset one pointer to the head and advance both pointers until they meet again
            fast = head;
            while (fast.next != slow.next) {
                fast = fast.next;
                slow = slow.next;
            }
            
            // Break the cycle
            slow.next = null;
            System.out.println("Loop broken at: " + slow.next);
            return;
        }
    }
    System.out.println("No loop detected");
}

