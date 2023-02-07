//Unique permutations of a given String

import java.util.*;
import java.io.*;

public class Main
{

  static String swap (String S, int l, int i)
  {

    char c[] = S.toCharArray ();
    char t = c[l];
      c[l] = c[i];
      c[i] = t;
      return String.valueOf (c);
  }

  static void permutate (String S, int l, int r,List<String> list)
  {
    if (l == r)
      {
	if (!list.contains (S))
	  list.add (S);
	return;
      }

    for (int i = l; i <= r; i++)
      {
	S = swap (S, l, i);
	permutate (S, l + 1, r, list);
	S = swap (S, l, i);
      }
  }


  public static void main (String[]args)
  {
    String S = "abc";
    int l = 0;
    int r = S.length () - 1;
    List < String > list = new ArrayList < String > ();
    permutate (S, l, r, list);
    Collections.sort (list);
    for(int i = 0 ; i < list.size();i++)
    {
        System.out.print(list.get(i)+" ");
    }
  }
}
