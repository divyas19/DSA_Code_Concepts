import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int a[]= {5,2,6,1,4,7,3,6};
	   int profit =0;
	   for(int i = 0 ; i<a.length-1;i++)
	   {
	       if(a[i]<a[i+1])
	       {
	           profit+=a[i+1]-a[i];
	       }
	   }
		System.out.println(profit);
	}

}
