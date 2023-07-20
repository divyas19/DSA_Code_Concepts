//Print all subsequences of a given String.

public class Solution {


   public static void sol(String str, int idx, String ns) {
       if(idx==str.length()) {
           System.out.println(ns);
           return;
       }
      char c = str.charAt(idx);
       sol(str,idx+1,ns+c);
       sol(str,idx+1,ns);
   }
   public static void main(String args[]) {
       String str = "abc";
       sol(str, 0, "");
   }
}

/*
o/p

abc
ab
ac
a
bc
b
c

*/
