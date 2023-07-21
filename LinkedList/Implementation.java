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
    
    public static void main(String args[])
    {
        LL obj = new LL();
        obj.addFirst("1");
        obj.addFirst("3");
        obj.addLast("2");
        System.out.println(obj.getSize());//3
        // obj.printList();//3 1 2 null
        // obj.deleteFirst();
        // obj.printList();//1 2 null
        // obj.deleteFirst();
        // obj.printList();//2 null
        // obj.deleteFirst();
        // obj.printList();// List Empty
        obj.deleteLast();
        obj.printList();//3 1 null
        obj.deleteLast();
        obj.printList();//3 null
        obj.deleteLast();
        obj.printList();//List Empty
        obj.deleteLast();
        obj.printList();//List Empty
        System.out.println(obj.getSize());//0
    }
}
