import java.io.*;
import java.util.*;

public class LL
{
    Node head;
    private int size =0;
    
    LL()
    {
        size=0;
    }
    
    public class Node 
    {
        int data;
        Node next;
        
        Node(int data)
        {
        this.data = data;
        this.next = null;
        size++;
        }
    }
    
    void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        head = newNode;
        newNode.next= temp;
    }
    
    void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!= null)
        temp = temp.next;
        
        temp.next = newNode;
    }
    
    void addMiddle(int data, int pos)
    {
        if(pos > size || pos < 0) {
           System.out.println("Invalid Index value");
           return;
       }
       size++;
       
        Node newNode = new Node(data);
        if(head == null||pos==0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curNode = head;
        
        for(int i=1; i < size;i++)
        {
           
           if(i== pos)
           {
               Node temp = curNode.next;
               curNode.next = newNode;
               newNode.next= temp;
               break;
           }
           curNode = curNode.next;
           
        }
        
        
    }
    
    void deleteFirst()
    {
        if(head == null)
        {
           System.out.println("Empty");
           return;
        }
        
        head = head.next;
        size--;
    }
    
    void deleteLast()
    {

        if(head == null)
        {
           System.out.println("Empty");
           return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }
        
        Node prev = head;
        Node curNode = head.next;
        while(curNode.next != null)
        {
          prev = prev.next;
          curNode = curNode.next;
        }
        prev.next = null;
    }
    
    int getSize()
    {
        return size;
    }
    
    void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String args[])
    {
        LL obj = new LL();
        obj.addFirst(12);
        obj.print();
        obj.addFirst(18);
        obj.print();
        obj.addLast(10);
        obj.print();
        obj.deleteFirst();
        obj.print();
        obj.deleteLast();
        obj.print();
        obj.addFirst(13);
        obj.print();
        obj.addMiddle(9,1);
        obj.print();
       System.out.println(obj.getSize());
    }
    
}

/*
OUTPUT
12->null
18->12->null
18->12->10->null
12->10->null
12->null
13->12->null
13->9->12->null
4
*/
