import java.util.*;
import java.io.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the value of N:");
    int N = sc.nextInt ();
    for (int i = 0; i <= N / 2; i++)
      {
	int k = 0;
	while (k < i)
	  {
	    System.out.print (" ");
	    k++;

	  }
	for (int j = i; j < N - i; j++)
	  {

	    System.out.print ("*");
	  }
	System.out.println ();
      }
  }
}


/*
*****
 ***
  *
*/
