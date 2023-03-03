import java.io.*;
import java.util.*;

public class Main
{
   
    static class stack
    {
        public static ArrayList<Integer> al = new ArrayList<Integer>();
        
        public static void push(int data)
        {
            al.add(data);
        }
        
        public static int pop()
        {
           if(al.size() ==0)
           return -1;
           else
           {
               int v = al.remove(al.size()-1);
               return v;
           }
        }
        
        public static boolean empty()
        {
            if(al.size() ==0)
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
                return al.get(al.size()-1);
            }
            
        }
        
        public static void print()
        {
            
            if(al.size() ==0)
            System.out.println("Stack is Empty:");
            else
            {
                
            int len = al.size()-1;
            while(len>= 0)
            {
                System.out.print(al.get(len));
               len--;
            }
            System.out.println();
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
