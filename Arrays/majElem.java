//Two For loop  - O(N^2)             , SC - O(1)

//Using Sorting - NlogN+N = O(NlogN) , SC - O(1)

//Using HashMap - O(N)               , SC - O(N)

import java.util.*;
import java.io.*;

public class Main
{
  public static void main (String[]args)
  {
    int a[] = {4,1,1,2,2,2,2,1,4};
    int N= a.length;
    if(N==1)
    {
        System.out.println(a[0]);
    }
    int compare = N/2;
    Arrays.sort(a);
    int i =0;
    int mx = 0;
    int maxElem =0;
    while(i<N-1)
    {
        int ct =1;
        int j = i;
        while((a[j] == a[j+1]) && (j<N-2))
        {
            ct++;
            j++;
        }
        if(ct>mx)
        {
        maxElem = a[j-1];
        mx = ct;
        }
        i+=ct;
    }
    
    if(mx>=compare)
    System.out.println(maxElem);
    else
    System.out.println("No such Element:");
  }
}

