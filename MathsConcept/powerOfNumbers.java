//O(logN)

import java.io.*;
import java.util.*;

class Main
{
        
    static long power(int N,int R)
    {
        //Your code here
        long m = 1000000007;
        long v = N;
        long p = R;
        long res =1;
       while(p>0)
       {
           if((p&1) !=0)
           {
               res=(res*v)%m;
               p= p-1;
           }
           else
           {
               v = (v*v)%m;
               p=p/2;
           }
       }
        return res;
    }
    
    public static void main(String args[])
    {
        System.out.println(power(12,21));
    }

}
