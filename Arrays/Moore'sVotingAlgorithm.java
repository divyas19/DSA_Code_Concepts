//TC - O(N) , SC - O(1)

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,4,4,4,4};
		int ansind = 0;
		int ct=1;
		int c =0;
		for(int i = 1; i < a.length;i++)
		{
		    if(a[i] == a[ansind])
		    {
		        ct++;
		    }
		    else{
		        ct--;
		    }
		    if(ct==0)
		    {
		        ansind = i;
		        ct =1;
		    }
		}
		
		for(int i = 0; i < a.length;i++)
		{
		    if(a[ansind]==a[i])
		    c++;
		}

		if(c>(a.length/2))
		System.out.println("Majority element: "+a[ansind]);
		else{
		    System.out.println("No such element:");
		}
	}
}

