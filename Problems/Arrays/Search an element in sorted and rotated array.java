
import java.io.*;
import java.util.*;

public class Main
{

  static int Search (int array[], int target)
  {
    // code here
    int l = 0;
    int h = array.length - 1;

    while (l <= h)
      {
	int m = l + (h - l) / 2;
	if (array[m] == target)
	  return m;

	if (array[l] < array[m])
	  {
	    if (target >= array[l] && target < array[m])
	      {
		h = m - 1;
	      }
	    else
	      {
		l = m + 1;
	      }
	  }
	else
	  {
	    if (target > array[m] && target <= array[h])
	      {
		l = m + 1;
	      }
	    else
	      {
		h = m - 1;
	      }
	  }
      }
    return -1;
  }


  public static void main (String args[])
  { 
    // int array[] = { 2,23,45,67,89 };
    int array[] = { 67,89,2,23,45 };
    int target = 23;

     int ans = Search(array,target);
     System.out.println("Index is "+ans+" value is "+array[ans]);
  }
}
