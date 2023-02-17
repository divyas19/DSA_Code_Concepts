import java.util.*;
import java.io.*;

class Main
{
    
    static void merge(int arr[], int l, int m, int r)
    {
         int mergeArr[] =new int[r-l+1];
         int k = 0;
         int ind1 = l;
         int ind2 = m+1;
         
         while(ind1 <= m && ind2 <= r)
         {
             
             if(arr[ind1] <= arr[ind2])
             {
                 mergeArr[k++] = arr[ind1++];
             }
             else
             {
                 mergeArr[k++] = arr[ind2++];
             }
             
             
         }
         
         while(ind1 <= m)
         {
              mergeArr[k++] = arr[ind1++];
         }
         
          
         while(ind2 <= r)
         {
              mergeArr[k++] = arr[ind2++];
         }
         
         for(int i=0,j=l;i<mergeArr.length;i++,j++)
         {
              arr[j]=mergeArr[i];
         }
         
    }
    
    static void mergeSort(int arr[], int l, int r)
    {
    if(l<r)
    {
        int mid = l+(r-l) /2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);  
    }
    }
    
    public static void main(String args[])
    {
        int arr[] = {2,6,4,7,3};
        int l =0;
        int r = arr.length-1;
        mergeSort(arr,l,r);
        for(int i =0; i <arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}

