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

public class Solution {
   public static void sol(String str, int idx, String ns) {
       if(idx==str.length()) {
           System.out.println(ns);
           return;
       }
      char c = str.charAt(idx);
      String cCaps = String.valueOf(c).toUpperCase();
       sol(str,idx+2,ns+c+str.charAt(idx+1));
       sol(str,idx+2,ns+cCaps+str.charAt(idx+1));
   }
   public static void main(String args[]) {
       String s = "a1B2";
       String str = s.toLowerCase();
       sol(str, 0, "");
   }
}

/*
o/p
a1b2
a1B2
A1b2
A1B2
*/
