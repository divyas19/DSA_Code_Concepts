import java.io.*;
import java.util.*;

class Main
{
      
    static void powerset(String S,int i, String cur,List<String> l)
    {
       
        if(i==S.length())
       {
           if(cur!="")
           {
           l.add(cur);
           }
           return;
       }
       powerset(S,i+1,cur+S.charAt(i),l);
       powerset(S,i+1,cur,l);
    }
   
    
    public static void main(String args[])
    {
         List<String> l = new ArrayList<String>();
        
        int i =0;
        String cur="";
        String S ="abc";
        powerset(S,i,cur,l);
        Collections.sort(l);
        for(int j = 0; j< l.size();j++)
        {
            System.out.print(l.get(j)+" ");
        }
        
    }
}

