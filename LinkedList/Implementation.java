import java.io.*;

public class LL{
    
    public LL()
    {
        this.size =0;
    }
    
    public  Node head;
    private int size;
    
    public class Node
    {
        String data;
        Node next;
        
        Node(String val)
        {
            data = val;
            
        }
    }

    
    public  void addFirst(String data)
    {
        
        Node newNode = new Node(data);
        size++;
        
        if(head == null)
        {
        head = newNode;
        return;
        }
        
        newNode. next = head;
        head = newNode;
       
    }

    
    public  void addLast(String data)
    {
        Node newNode = new Node(data);
        size++;
        
        if(head == null)
        {
        head = newNode;
        return;
        }
        
        Node t = head;
        while(t.next != null)
        t = t.next;
        
        t.next = newNode;
       
    }

    
    public  void printList()
    {
        if(head == null)
        {
            System.out.println("List Empty");
            return;
        }
        
        Node t = head;
        while(t!= null)
        {
            System.out.print(t.data+" -> ");
            t = t.next;
        }
        System.out.println("null");
      
    }


    
    public void deleteFirst()
    {
        if(head == null)
        {
        System.out.println("Nothing to delete");
        return;
        }
    
        size--;
        System.out.println("Element deleted : "+head.data);
        head = head.next;
    }

    
    public void deleteLast()
    {
        Node t = head;
        if(head== null)
        {
        System.out.println("Nothing to delete");
        return;
        }
        
        if(head.next == null)
        {
             System.out.println("Element deleted : "+ head.data);
             head = null;
             size--;
             return;
        }
        
        while(t.next.next != null)
        t = t.next;
        
        System.out.println("Element deleted : "+ t.next.data);
        t.next = null;
        
        size--;
    }


    
    public int getSize()
    {
        return size;
    }


    
    public void reverseIterate()
    {
        if(head == null || head.next == null)
        return;
        
        Node prev = head;
        Node cur = head.next;
        while(cur != null)
        {
            Node nextNode = cur.next;
            cur.next = prev;
            
            prev = cur;
            cur = nextNode;
        }
        head.next = null;
        head = prev;
    }


    
    public Node reverseRec(Node head)
    {
        if(head == null || head.next == null)
        return head;
        
        Node newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }


    
    public static void main(String args[])
    {
        LL obj = new LL();
        obj.addFirst("1");
        obj.addFirst("3");
        obj.addLast("2");
        System.out.println(obj.getSize());//3
        obj.printList();//3 1 2 null
        // obj.deleteFirst();
        // obj.printList();//1 2 null
        // obj.deleteFirst();
        // obj.printList();//2 null
        // obj.deleteFirst();
        // obj.printList();// List Empty
        // obj.deleteLast();
        // obj.printList();//3 1 null
        // obj.deleteLast();
        // obj.printList();//3 null
        // obj.deleteLast();
        // obj.printList();//List Empty
        // obj.deleteLast();
        // obj.printList();//List Empty
        // System.out.println(obj.getSize());//0
        obj.reverseIterate();
        obj.printList();
        obj.head = obj.reverseRec(obj.head);
        obj.printList();
    }

    
}



____________________________________________________________________________________________________________

    import java.util.*;

class LL{

    private int size;
    Node head;
    
    LL()
    {
        size  = 0;
    }
    
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;
            next = null;
        }
    }
    
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        Node t = head;
        
        while(t.next != null)
            t= t.next;
        
        t.next = newNode;
        
        size++;
        
    }
    
    public Node reverseList(Node head)
    {
        Node prev=null;

        Node cur = head;

        while(cur!=null){

            Node next=cur.next;

            cur.next=prev;

            prev=cur;

            cur=next;

        }
        return prev;
    }
    
    public Node reverseK(Node head, int k)
    {
        Node prev = null;
        Node cur = head;
        Node nextNode = null;
        int ct = 1;
        while(cur != null && ct <= k)
        {
            nextNode = cur.next;
            cur.next = prev;
            
            prev = cur;
            cur = nextNode;
            ct++;
        }
        
        if(cur == null)
            return prev;
        
        if(nextNode!=null){

            head.next=reverseK(nextNode, k);
        }

        return prev;
    }
    
    public boolean isPalindrome(Node head) {

      if(head== null|| head.next == null)
        return true;

     Node temp = head;
     int ct =0;
     while(temp != null)
     {
         temp = temp.next;
         ct++;
     }
 
     int m =ct/2;

     Node t = head;
     int ind =1;
     while(t!= null && ind < m)
     {
         t=t.next;
            
         ind++;
     }
     
     Node r=reverseList(t);
     
     Node l = head;

     while(r!= null && l!= null)
     {
         if(r.data != l.data)
         return false;
         r = r.next;
         l = l.next;
     }
   
     return true;

    }

    
    public void removeNthNodeFromLast(Node head, int k)
    {
       if (head == null || k <= 0)  
        return;
        
        Node temp = head;
        int ct=0;
        while(temp!= null)
        {
            temp= temp.next;
            ct++;
        }
        
         if(k > ct) //Last Element to be deleted from end is more than size
         return;
         
         if(k == ct) //Last Element to be deleted from end is first element
         {
             head = head.next;
             return;
         }
        
        int pos = ct-k+1;
        int prevpos = ct-k;
        
        int counter =1;
        Node t = head;
        while(t!=null && counter < prevpos)
        {
            t = t.next;
            counter++;
        }
        
        t.next = t.next.next;
        return;
    }
    
    public Node compute(Node head)
    {
        if(head == null || head.next == null)
            return head;
        
        Node rev = reverseList(head);
        Node prev = rev;
        Node cur = prev.next;
        
        int max = prev.data;
        
        while(cur != null)
        {
            if(cur.data < max)
            {
                prev.next = cur.next;
                cur = cur.next;
            }
            else
            {
                max = cur.data;
                prev = cur;
                cur = cur.next;
            }
        }
        
        Node ans = reverseList(rev);
        return ans;
      
    }
    
    public static void main(String args[])
    {
        // LinkedList<Integer> ll = new LinkedList<Integer>();
        // ll.add(2);
        // ll.add(0,1);
        // ll.add(3);
        // ll.add(4);
        // ll.add(5); // 1 2 3 4 5
        // ll.add(6);
        // ll.add(7);
        // ll.add(8);
        // // System.out.println(ll.size()); // 5
        // // System.out.println(ll.isEmpty()); // false
        // // System.out.println(ll.get(2)); //3
        // // System.out.println(ll.getFirst()); // 1
        // // System.out.println(ll.getLast()); // 5
        // // ll.remove(); // 2 3 4 5
        // // ll.remove(3);  // 2 3 4
        // // ll.removeLast(); // 2 3
        // for(int i : ll)
        // {
        //     System.out.print(i+" ");
        // }
        
        LL obj = new LL();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        obj.addLast(6);
        obj.addLast(7);
        obj.addLast(8);
        
        // 1 2 3 4 5 6 7 8
        // Node t = obj.head;
        // while(t!=null)
        // {
        // System.out.print(t.data+" ");
        // t= t.next;
        // }
        
        // obj.head = obj.reverseList(obj.head);
        
        // obj.head = obj.reverseK(obj.head,3);
        
        // obj.removeNthNodeFromLast(obj.head,1);
        
        
        // if(obj.isPalindrome(obj.head))
        // {
        //     System.out.println("True");
        // }
        // else
        // {
        //     System.out.println("Flase");
        // }
        
        obj.head = obj.compute(obj.head);
        Node temp = obj.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        
    }
    
}

