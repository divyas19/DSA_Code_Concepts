import java.io.*;
import java.util.*;


public class Main
{
    public static void pushAtBottom(Stack<Integer> st, int value)
    {
        if(st.isEmpty())
        {
            st.push(value);
            return;
        }
        int top= st.pop();
        pushAtBottom(st,value);
        
        st.push(top);
    }
    
    public static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty())
        return;
        
        int top =st.pop();
        reverse(st);
        pushAtBottom(st,top);
        
    }
  public static void main (String[]args)
  {
    Stack < Integer > st = new Stack < Integer > ();
    st.push (1);
    st.push (2);
    st.push (3);
    st.push(4);
    // pushAtBottom(st,5);
    // while(!st.isEmpty())
    // {
    //     System.out.print(st.peek());
    //     st.pop();
    // }
    System.out.println(st);
    
    reverse(st);
     System.out.println(st);
    while(!st.isEmpty())
    {
        System.out.print(st.peek());
        st.pop();
    }
  }
}


/////////////////////////////////////////////////////////////////////////////////

class Solution
{ 
    static void insert(Stack<Integer> s, int temp)
    {
        // add your code here
        if(s.size()==0){
        s.push(temp);
        return;
        }
        int temp1 = s.peek();
        s.pop();
        insert(s,temp);
        s.push(temp1);
        
    }
    
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.size()==0)
        return;
        int temp = s.peek();
        s.pop();
        reverse(s);
        // s.push(temp);
        insert(s,temp);
    }
}
