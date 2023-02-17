import java.util.*;
import java.io.*;

class Main{
    
    public static void swap(int a[], int m, int n)
    {
        int t = a[m];
        a[m]=a[n];
        a[n] = t;
    }
    
    public static int partition(int a[], int l, int h)
    {
        int pivot = a[l];
        int i =l;
        int j= h;
        while(i<j)
        {
            while(a[i]<=pivot)
            i++;
            
            while(a[j]>pivot)
            j--;
            
            if(i<j)
            swap(a,i,j);
        }
        swap(a,j,l);
        
        return j;
    }
    
    public static void quicksort(int a[], int l, int h)
    {
        if(l<h)
        {
            int pivot = partition(a,l,h);
            quicksort(a,l,pivot-1);
            quicksort(a,pivot+1,h);
        }
    }
    
    public static void main(String args[])
    {
        int a[] = {2,5,4,3,6};
        int l=0;int h =a.length-1;
        quicksort(a,l,h);
        for(int i =0; i < a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
