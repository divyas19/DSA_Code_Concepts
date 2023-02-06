import java.io.*;
import java.util.*;

class Main
{
        static long numberOfPaths(int m, int n) {
        long ans = 0;
        if(m==1||n==1)
        return 1;
        
        ans = numberOfPaths(m-1,n)+numberOfPaths(m,n-1);
        return ans;
        
        }
    
    
    public static void main(String args[])
    {
        System.out.println(numberOfPaths(3,3));
    }

}
