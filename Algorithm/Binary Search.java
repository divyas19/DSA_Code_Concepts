/*
Iterative
TC - O(log n)
SC - O(1)

n --> n/2 --> n/4 --> after k steps  --> n/2^k
So one element left and n/2^k =1 --> log(n) = k
Atmost most log(n) steps
*/

import java.io.*;
import java.util.*;

public class Main{
    
    public static int binarySearch(int a[], int key)
    {
        int l = 0;
        int h = a.length-1;
        while(l<=h)
        {
            int m = (l+h)/2;
            if(a[m] == key)
            return m;
            else if(key <a[m])
            h = m-1;
            else
            l = m+1;
        }
        return -1;
    }
    
    
    public static void main(String args[])
    {
    int a[] = {2,23,45,67,89};
    int ind = binarySearch(a,89);
    if(ind != -1)
    System.out.println("Element at position "+ind+" and the value is "+a[ind]);
    else
    System.out.println("Element not found:");
    
    }
}





/*
Recursive
TC - O(log n)
SC - O(log n) , uses stack
*/

import java.io.*;
import java.util.*;

public class Main{
    
    public static int binarySearch(int a[],int l , int h, int key)
    {
        int m = (l+h)/2;
       if(l>h)
       return -1;
       
       if(a[m] == key)
       return m;
       
       if(key<a[m])
       return binarySearch(a,l,m-1,key);
       
       return binarySearch(a,m+1,h,key);
    }
    
    
    public static void main(String args[])
    {
    int a[] = {2,23,45,67,89};
    int ind = binarySearch(a,0,a.length-1,3);
    if(ind != -1)
    System.out.println("Element at position "+ind+" and the value is "+a[ind]);
    else
    System.out.println("Element not found:");
    
    }
}
