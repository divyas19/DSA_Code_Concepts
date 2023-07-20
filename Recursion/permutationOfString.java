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

________________________________________________________________________________________________________
//Print all permutation

public class Solution {


   public static void printPermutation(String str,  String perm) {
       if(str.length() == 0) {
           System.out.println(perm);
           return;
       }
      
       for(int i=0; i<str.length(); i++) {
           char currChar = str.charAt(i);
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr,  perm+currChar);
       }
   }
   public static void main(String args[]) {
       String str = "abc";
       printPermutation(str,"");
   }
}

/*
o/p

abc
acb
bac
bca
cab
cba

*/

___________________________________________________________________________________________________________________
//Print unique permutation
	
import java.util.*;
public class Main {


   public static HashSet<String> printPermutation(String str,  String perm,HashSet<String> h ) {
       if(str.length() == 0) {
           h.add(perm);
           return h;
       }
      
       for(int i=0; i<str.length(); i++) {
           char currChar = str.charAt(i);
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr,  perm+currChar,h);
       }
       
       return h;
   }
   public static void main(String args[]) {
       String str = "aaa";
       HashSet<String> h = new HashSet<String>();
       HashSet<String> ans =printPermutation(str,"",h);
       
       System.out.println(ans);
   }
}

/*
o/p
[aaa]
*/
