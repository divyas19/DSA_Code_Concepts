import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    // int arr[] = { 3, 0, 0, 2, 0, 4 }; o/p=10
    int arr[] = {6,9,9};
    int l[] = new int[arr.length];
    int r[] = new int[arr.length];
    l[0] = arr[0];
    for (int i = 1; i < arr.length; i++)
      {
	if (arr[i] > l[i - 1])
	  {
	    l[i] = arr[i];
	  }
	else
	  {
	    l[i] = l[i - 1];
	  }
      }

    r[arr.length - 1] = arr[arr.length - 1];
    for (int i = arr.length - 2; i >= 0; i--)
      {
	if (arr[i] > r[i + 1])
	  {
	    r[i] = arr[i];
	  }
	else
	  {
	    r[i] = r[i + 1];
	  }
      }
    long sum = 0;
    for (int i = 0; i < arr.length; i++)
      {
	sum += (Math.min (l[i], r[i]) - arr[i]);
      }

    System.out.println (sum);
  }
}
