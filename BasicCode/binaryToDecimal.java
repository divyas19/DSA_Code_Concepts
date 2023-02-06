import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])
    {
        int a = 1000;
        
        int dec =0;
        int ld =0;
        int p = 0;
         while(a>0)
         {
             ld  = a%10;
             dec+=ld*Math.pow(2,p);
             p++;
             a=a/10;
         }
         System.out.println(dec);
    }
}

