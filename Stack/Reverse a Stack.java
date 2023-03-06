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
