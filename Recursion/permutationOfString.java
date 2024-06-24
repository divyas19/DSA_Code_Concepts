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
import java.io.*;

public class Solution {

   public static HashSet<String> h = new HashSet<>();
   
   public static void printPermutation(String str,  String perm) {
       if(str.length() == 0) {
           System.out.println(perm);
           h.add(perm);
           return;
       }
      
       for(int i=0; i<str.length(); i++) {
           char currChar = str.charAt(i);
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr,  perm+currChar);
       }
   }
   public static void main(String args[]) {
       String str = "acc";
       printPermutation(str,"");
       System.out.println(h);
   }
}
/*
o/p
[aaa]
*/

_____________________________________________________________________________________________________________________________________________ 

Letter Case Permutation

Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
Return a list of all possible strings we could create. Return the output in any order.
   
Example 1:
Input: s = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]
   
Example 2:
Input: s = "3z4"
Output: ["3z4","3Z4"]

public class Solution {

  public static void printPermutation(String str, String perm) {
      if (str.length() == 0) {
          System.out.println(perm);
          return;
      }
      
      char currChar = str.charAt(0);
      String newStr = str.substring(1);

      if (Character.isDigit(currChar)) {
          printPermutation(newStr, perm + currChar);
      } else {
          printPermutation(newStr, perm + Character.toLowerCase(currChar));
          printPermutation(newStr, perm + Character.toUpperCase(currChar));
      }
  }
   
  public static void main(String args[]) {
      String str = "3z4";
      printPermutation(str, "");
  }
}

/*
o/p
a1b2
a1B2
A1b2
A1B2
*/

/*
o/p
3z4
3Z4
*/

_______________________________________________________________________________________________________________________________________
   
//Print all cases permutations with numbers
   
public class Solution {

   public static void printPermutation(String str,  String perm) {
       if(str.length() == 0) {
           System.out.println(perm);
           return;
       }
      
       for(int i=0; i<str.length(); i+=2) {
           char currChar = str.charAt(i);
           String currCharCaps = String.valueOf(currChar).toUpperCase();
           String newStr = str.substring(0, i) + str.substring(i+2);
           printPermutation(newStr,  perm+currChar+str.charAt(i+1));
           printPermutation(newStr,  perm+currCharCaps+str.charAt(i+1));
       }
   }
   public static void main(String args[]) {
       String s = "a1b1";
      String str = s.toLowerCase();
      printPermutation(str,"");
   }
}

/*
o/p
a1b1
a1B1
A1b1
A1B1
b1a1
b1A1
B1a1
B1A1
*/
