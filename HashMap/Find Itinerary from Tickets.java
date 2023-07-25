//The connection to various places is given in HashMap. And there is only one path to a place. 
//It is possible to travel all places by choosing correct start.
//Write code to display required path

import java.util.*;
import java.io.*;

class Main
{
    public static String getStart(HashMap<String,String> hm)
    {
        String start="";
        HashMap<String,String> rev = new HashMap<String,String>();
        for(String key : hm.keySet())
        {
            rev.put(hm.get(key),key);
            
        }
        
        for(String key : hm.keySet())
        {
            if(!rev.containsKey(key))
            start = key;
        }
        return start;
    }
    public static void main(String args[])
    {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("Chandighar","Srinagar");
        hm.put("Meerut","Ahmednagar");
        hm.put("Danapur","Bengaluru");
        hm.put("Ahmednagar","Danapur");
        hm.put("Srinagar","Meerut");
        
        String start = getStart(hm);
        
        while(hm.containsKey(start))
        {
            System.out.print(start+"->");
            start = hm.get(start);
        }
        
       System.out.println(start); 
    }
}

//O/P
//Chandighar->Srinagar->Meerut->Ahmednagar->Danapur->Bengaluru
