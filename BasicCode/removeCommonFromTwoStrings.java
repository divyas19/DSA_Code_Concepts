//Remove common from both string and concatenate, if all are common return -1.

    public static String concatenatedString(String s1,String s2)
    {
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
    
        
        for(int i=0;i<s1.length();i++)
	{
            char ch = s1.charAt(i);
            h1.put(ch,1);
        }
        
        
        for(int i=0;i<s2.length();i++)
	{
            char ch = s2.charAt(i);
            h2.put(ch,1);
        }
        
        String con = s1+s2;
        StringBuilder res = new StringBuilder();
        int n = con.length();
        
        for(int i=0;i<n;i++)
	{
            char ch = con.charAt(i);
            if(!h1.containsKey(ch) && h2.containsKey(ch) || !h2.containsKey(ch) && h1.containsKey(ch))
	    {
                
                res.append(ch);
                
            }
            
        }
        
        return res.toString().isEmpty()?"-1":res.toString();
    }
}
____________________________________________________________________________________________________________

    public static String concatenatedString(String s1,String s2)
    {
          String ans2 = "";
          String ans1="";
          String not="";
	
        HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
        for(int i=0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(hm1.containsKey(ch))
            {
                hm1.put(ch,hm1.get(ch)+1);
            }
            else
            {
                hm1.put(ch,1);
            }
        }
        
        for(int j=0; j < s2.length(); j++)
        {
            char ch = s2.charAt(j);
            if(hm1.containsKey(ch))
            {
                hm1.put(ch,0);
                not+=ch;
            }
            else
            {
                ans2+=ch;
            }
        }
        
        if(hm1.size()==0)
        {
            return "-1";
        }
        
         for(int i=0; i < s1.length(); i++)
         {
             String check = String.valueOf(s1.charAt(i));
             if(!not.contains(check))
             {
                ans1+=check;
             }
         }
        
        
        String ans = ans1+ans2;
       
      
        return ans;
    }     

/*
For Input: 
abeff
abcd
Output: 
effcd
*/
____________________________________________________________________________________________________________

//Form a Single String from Two Strings by removing the common attributes.

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
 public static void main (String[]args) throws java.lang.Exception
 {

  Scanner sc = new Scanner (System.in);
	int x = sc.nextInt ();
	int y = sc.nextInt ();

	String str1 = sc.next ();
	String str2 = sc.next ();
	int[] arr1 = new int[26];
	int[] arr2 = new int[26];
	int[] a = new int[26];
   
	for (int i = 0; i < x; i++)
	  {
	    arr1[str1.charAt (i) - 'a'] = arr1[str1.charAt (i) - 'a'] + 1;
	  }
	System.out.println ();

	for (int i = 0; i < y; i++)
	  {
	    arr2[str2.charAt (i) - 'a']++;
	  }   
	System.out.println ();
      
	for (int i = 0; i < 26; i++)
	  {
	    a[i] = Math.abs (arr1[i] - arr2[i]);
	  }
      
	String check = "";
	for (int i = 0; i < 26; i++)
	  {
	    if (a[i] > 0)
	      for (int k = 0; k < a[i]; k++)
		check += ((char) (i + 97));
	  }
      
	System.out.print (check);
      
  }
}

/*
1
5
4
abeff
abcd
cdeff
*/
