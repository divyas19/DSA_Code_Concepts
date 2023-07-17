import java.io.*;
import java.util.*;

public class Main{
    
    static int a=0;
    static int b =1;
    public static void printIt(int n)
    {
        
        if(n==0)
        return;
       
        int c= a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        
       
        printIt(n-1); 
        
    }

     public static void main(String []args)
     {
        int n = 7;
        System.out.print(0+" "+1+" ");
        printIt(n-2);
    
    }
         
}
