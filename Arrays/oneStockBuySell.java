import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int a[]= {5,2,6,1,4,7,3,6};
	    int minsofar = a[0];
	    int maxprofit = 0;
	    for(int i = 0 ; i< a.length;i++)
	    {
	        minsofar = Math.min(minsofar,a[i]);
	        int profit = a[i]-minsofar;
	        if(profit>maxprofit)
	        {
	            maxprofit= profit;
	        }
	    }
		System.out.println(maxprofit);
	}

}
