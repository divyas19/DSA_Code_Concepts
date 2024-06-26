//Print all subsequences of a given String.
//PowerSet

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

------------------------------------------------------------------------------------------------------------------------------

  public class Solution {

public static void sol(String str, int idx, String ns) {
       if(idx==str.length()-1) {
           System.out.println(ns+str.charAt(str.length()-1));
           return;
       }
      char c = str.charAt(idx);
       sol(str,idx+1,ns+c+"_");
       sol(str,idx+1,ns+c);
   }
   public static void main(String args[]) {
       String s = "abc";
       String str = "";
       sol(s, 0, "");
   }
}

// O/P
// a_b_c
// a_bc
// ab_c
// abc
