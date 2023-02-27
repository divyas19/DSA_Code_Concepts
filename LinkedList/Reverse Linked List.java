/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev=null;

        Node cur = head;

        while(cur!=null){

            Node next=cur.next;

            cur.next=prev;

            prev=cur;

            cur=next;

        }
        head.next = null;
        return prev;
    }
}
