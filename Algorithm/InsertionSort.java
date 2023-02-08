//O(N^2)Better than Bubble Sort

import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    int a[] = { 5, 2, 6, 1, 4, 7, 3, 6 };
    for(int i = 1;i<a.length;i++)
    {
        int t = a[i];
        int j = i-1;
        while(j>=0 && a[j]>t)
        {
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = t;
    }

    for (int i = 0; i < a.length; i++)
      {
	System.out.print (a[i] + " ");
      }
  }

}
