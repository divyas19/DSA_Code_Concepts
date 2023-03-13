import java.util.*;
import java.io.*;

public class Main
{
    
    static class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static class que
    {
        static Node head = null;
        static Node tail = null;
        
        
        static boolean isEmpty()
        {
            
            return head == null && tail == null;
        }
        
        
        static void add(int val)
        {
           Node add = new Node(val);
          if(isEmpty())
          {
              tail = head = add;
              tail = add;
          }
          tail.next = add;
          tail = add;
        }
        
        static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty");
                return -1;
            }
            int front = head.data;
            if(head == null)
            {
                tail = null;
            }
            head = head.next;
            return front;
            
        }
        
        static int peek()
        {
            if(isEmpty())
            {
            System.out.println("Empty");
            return -1;
            }
          
             return head.data;
            
        }
    }
    
    public static void main(String args[])
    {
        que obj = new que();
        que.add(1);
        que.add(4);
        que.add(8);
        que.add(3);
        que.add(2);
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.peek());
    
    }
    
}
