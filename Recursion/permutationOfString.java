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
   
//Print all cases permutations
   
import java.util.*;
import java.io.*;

public class Solution {

   public static void printPermutation(String str,  String perm) {
       if(str.length() == 0) {
           System.out.println(perm);
           return;
       }
      
       for(int i=0; i<str.length(); i++) {
           char currChar = str.charAt(i);
           String currCharCaps = String.valueOf(currChar).toUpperCase();
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr,  perm+currChar);
           printPermutation(newStr,  perm+currCharCaps);
       }
   }
   public static void main(String args[]) {
       String s = "ab";
       printPermutation(s,"");
   }
}
/*
o/p
ab
aB
Ab
AB
ba
bA
Ba
BA
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
