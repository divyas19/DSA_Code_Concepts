/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        
        if(node == null||node.next == null)
        return node;  
        
        Node prev=null;

        Node curr=node;

       
        int count=1;

        Node nextNode = null;

        while(curr!=null && count<=k){

            nextNode=curr.next;

            curr.next=prev;

            prev=curr;

            curr=nextNode;

            count++;

        }

        if(nextNode!=null){

            node.next=reverse(nextNode, k);
        }

        return prev;
    }
}


//GFG
