//Form a Single String from Two Strings by removing the common attributes.

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
 public static void main (String[]args) throws java.lang.Exception
 {

  Scanner sc = new Scanner (System.in);
	int x = sc.nextInt ();
	int y = sc.nextInt ();

	String str1 = sc.next ();
	String str2 = sc.next ();
	int[] arr1 = new int[26];
	int[] arr2 = new int[26];
	int[] a = new int[26];
   
	for (int i = 0; i < x; i++)
	  {
	    arr1[str1.charAt (i) - 'a'] = arr1[str1.charAt (i) - 'a'] + 1;
	  }
	System.out.println ();

	for (int i = 0; i < y; i++)
	  {
	    arr2[str2.charAt (i) - 'a']++;
	  }   
	System.out.println ();
      
	for (int i = 0; i < 26; i++)
	  {
	    a[i] = Math.abs (arr1[i] - arr2[i]);
	  }
      
	String check = "";
	for (int i = 0; i < 26; i++)
	  {
	    if (a[i] > 0)
	      for (int k = 0; k < a[i]; k++)
		check += ((char) (i + 97));
	  }
      
	System.out.print (check);
      
  }
}






/*
1
5
4
abeff
abcd
cdeff
*/
