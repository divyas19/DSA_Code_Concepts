import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    int a[] = { 5, 2, 6, 1, 4, 7, 3, 6 };
    for (int i = 0; i < a.length - 1; i++)
      {
	//boolean f = false;
	for (int j = 0; j < a.length - 1 - i; j++)
	  {
	    if (a[j] > a[j + 1])
	      {
		//f = true;
		int t = a[j];
		a[j] = a[j + 1];
		a[j + 1] = t;
	      }
	  }
	//if (f == false)
	//  break;
      }

    for (int i = 0; i < a.length; i++)
      {
	System.out.print (a[i] + " ");
      }
  }

}
