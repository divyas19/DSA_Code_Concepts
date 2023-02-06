//First Way O(N)
import java.io.*;
import java.util.*;

class Main
{
     
    static boolean isPalindrome(String s,int l, int r)
    {
        if(l>=r)
        return true;
        
        if(s.charAt(l)!=s.charAt(r))
        return false;
       
        return isPalindrome(s,l+1,r-1);
        
    }
     
    public static void main(String args[])
    {
        String s = "dcababacd";
        
        if(isPalindrome(s,0,s.length()-1))
        {
            System.out.println("Is Palindrome:");
        }
        else
        System.out.println("Not a Palindrome:");
        
    }

}


//Second Way
import java.io.*;
import java.util.*;

class Main
{
     
    public static void main(String args[])
    {
        String s = "cababac";
        int l=0;
        int r = s.length()-1;
        int f=1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                f=0;
                break;
            }
            l++;
            r--;
        }
        if(f==0)
        System.out.println("Is not Palindrome:");
        else
        System.out.println("Is Palindrome:");
    }

}


