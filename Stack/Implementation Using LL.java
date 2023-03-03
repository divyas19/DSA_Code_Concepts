import java.io.*;
import java.util.*;

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
    
    static class stack
    {
        public static Node head = null;
         
        public static void push(int data)
        {
            Node add = new Node(data);
            add.next= head;
            head = add;
        }
        
        public static int pop()
        {
            if(head == null)
            {
                return -1;  
            }
            else
            {
            int v = head.data;
            head = head.next;
            return v;
            }
        }
        
        public static boolean empty()
        {
            if(head == null)
            return true;
            else
            return false;
        }
        
        public static int peek()
        {
            
            if(empty()) 
            {
                return -1;
            }
            else
            {
                return head.data;
            }
            
        }
        
        public static void print()
        {
            Node top = head;
            if(head == null)
            System.out.println("Stack is Empty:");
            else
            {
                Node temp = head;
            
            while(top!=null)
            {
                System.out.print(top.data);
                top = top.next;
            }
            }
        }
        
        
    }
    public static void main(String args[])
    {
        stack st = new stack();
        st.push(3);
        st.push(7);
        st.push(9);
        st.print();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.print();
        System.out.println(st.pop());
        System.out.println(st.pop());
        if(st.empty())
        {
            System.out.println("Empty:");
        }
        else
        {
            System.out.println("Not Empty:");
        }
        
    }
}
