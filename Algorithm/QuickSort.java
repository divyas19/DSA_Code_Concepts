//Memory save && In Worst Case - O(N^2), Else - O(NlogN)

import java.util.*;
import java.io.*;

class Solution {
    
    public static void swap(int a[], int f, int s)
    {
        int t = a[f];
        a[f] = a[s];
        a[s] = t;
    }
    
    
    public static int partition(int a[],int l, int h)
    {
        int pivot = a[h];
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a,i,j);
            }
        }

        i++;
        // Swap pivot element with the element at index i
        // int temp = a[i];
        // a[i] = pivot;
        // a[h] = temp;
        swap(a,i,h);

        return i;
    }

    
    
    public static void quickSort(int a[] , int l , int h)
    {
        if(l<h)
        {
        int pivot = partition(a,l,h);
        quickSort(a,l,pivot-1);
        quickSort(a,pivot+1,h);
        }
    }
    
    public static void main(String[] args) {
        int a[] = {3,-1,0,9,8};
        quickSort(a,0,a.length-1);
        for(int i =0; i < a.length; i++)
        System.out.print(a[i]+" ");
    }
}

//O/P
//-1 0 3 8 9 
