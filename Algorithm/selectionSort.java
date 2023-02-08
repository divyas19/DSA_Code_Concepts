import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    int a[] = { 5, 2, 6, 1, 4, 7, 3, 6 };
    for(int i =0; i < a.length-1;i++)
    {
        int min = i;
        for(int j = i+1; j < a.length;j++)
        {
            if (a[min]>a[j]) 
            {
                min = j;
            }
        }
        if(min!=i)
        {
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
    }
    for (int i = 0; i < a.length; i++)
      {
	System.out.print (a[i] + " ");
      }
  }

}
