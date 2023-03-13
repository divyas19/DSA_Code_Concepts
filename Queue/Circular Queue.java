import java.util.*;
import java.io.*;

public class Main{
    static class que
    {
        static int arr[] ;
        static int size;
        static int rear = -1;
        //No need to have front
        static int front = -1;
        
        que(int s)
        {
            arr = new int[s];
            this.size = s;
            
        }
        
        static boolean isEmpty()
        {
            // return rear == -1;
            return rear == -1 && front == -1;
        }
        
        static boolean isFull()
        {
            // return rear == size-1;
            return (rear+1)%size == front;
        }
        
        static void add(int val)
        {
            if(isFull())
            {
                System.out.println("Full");
            }

                // rear++;
                // arr[rear] = val;
                if(front == -1)
                front = 0;
                rear = (rear+1)%size;
                arr[rear] = val;
          
        }
        
        static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty");
                return -1;
            }
            else
            {
                // int value = arr[0];
                // for(int i = 0; i < rear;i++)
                // {
                //     arr[i] = arr[i+1];
                // }
                // rear--;
                // return value;
                int value = arr[front];
                if(rear == front)
                {
                    rear = front =-1;
                }
                else
                {
                    front =(front+1)%size;
                }
                return value;
            }
        }
        
        static int peek()
        {
            if(isEmpty())
            {
            System.out.println("Empty");
            return -1;
            }
            else
            {
                // return arr[0];
                return arr[front];
            }
        }
    }
    public static void main(String args[])
    {
        que obj = new que(5);
        que.add(1);
        que.add(4);
        que.add(8);
        que.add(3);
        que.add(2);
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.peek());
        que.add(8);
        System.out.println(que.isFull());
        System.out.println(que.isEmpty());
    }
}
