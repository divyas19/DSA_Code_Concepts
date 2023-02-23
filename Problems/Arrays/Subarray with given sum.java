//Array contains only positive values

import java.io.*;
import java.util.*;

public class Main
{

  static ArrayList < Integer > subArray (int[]arr, int n, int s)
  {

    ArrayList < Integer > res = new ArrayList <> ();
    int sum = 0;
    int j = 0;

    for (int i = 0; i <= n - 1; i++)
    {
	   sum = sum + arr[i];

	   while (sum >= s)
	   {
	    if (sum == s)
	    {

		  res.add (0, j );
		  res.add (1, i );
		  return res;
	    }
	    sum = sum - arr[j];
	    j = j + 1;
	   }
    }
    res.add (-1);
    return res;
  }
  
  public static void main (String args[])
  {
    int a[] = { 2, 3, 1, 3 ,4};
    int k = 4;
      ArrayList<Integer> res = subArray(a, a.length, k);             
      for(int i = 0;i<res.size();i++)                
      System.out.print(res.get(i) + " ");             
          
    
  }
}
