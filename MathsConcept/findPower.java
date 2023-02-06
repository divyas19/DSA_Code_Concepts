//O(N)

import java.io.*;
import java.util.*;

class Main
{
        
    static long power(int v,int p)
    {
        //Your code here
        long ans =1;
        if(p==0)
        return 1;
        
        ans = v*power(v,p-1);
        return ans;
    }
    
    public static void main(String args[])
    {
        System.out.println(power(3,3));
    }

}

