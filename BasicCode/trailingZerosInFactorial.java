import java.util.*;
import java.io.*;

class Solution{
    static int trailingZeros(int N)
    {
        int ct =0;
        for(int i = 5;N/i>0;i*=5)
        {
            ct+=N/i;
        }
        return ct;
    }
    public static void main (String[]args)
    {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter No");
    int N = sc.nextInt ();
    System.out.println (trailingZeros (N));
    }
}
