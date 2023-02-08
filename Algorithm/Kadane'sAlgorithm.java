//Find the contiguous sub-array which has the maximum sum.

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int a[]= {1,2,-4,5,6};
	    int ans = Integer.MIN_VALUE;
        int cur= 0;
        for(int i = 0; i < a.length; i++)
        {
            
            cur+= a[i];
            ans = Math.max(ans,cur);
        if(cur< 0)
            cur = 0;
        }
		System.out.println(ans);
	}

}
