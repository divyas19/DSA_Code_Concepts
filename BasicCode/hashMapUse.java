import java.util.*;

public class Hashing {
   public static void main(String args[]) {
       
       //Creation
       HashMap<String, Integer> map = new HashMap<>();
       //Insertion
       map.put("India", 120);
       map.put("US", 30);
       map.put("China", 150);
       System.out.println(map);
       map.put("China", 180);
       System.out.println(map);

       //Searching
       if(map.containsKey("Indonesia")) {
           System.out.println("key is present in the map");
       } else {
           System.out.println("key is not present in the map");
       }
       System.out.println(map.get("China")); //key exists
       System.out.println(map.get("Indonesia")); //key doesn't exist

       //Iteration (1)
       for( Map.Entry<String, Integer> e : map.entrySet()) {
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }

       //Iteration (2)
       Set<String> keys = map.keySet();
       for(String key : keys) {
           System.out.println(key+ " " + map.get(key));
       }

       //Removing
       map.remove("China");
       System.out.println(map);
   }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
public class Main{
    public static void main (String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        String s = new String();
        s="Apple";
        char c[] = s.toCharArray();
        for(char ch: c)
        {
            if(h.containsKey(ch))
            {
                h.put(ch,h.get(ch)+1);
            }
            else{
                h.put(ch,1);
            }
        }
        
        for(Map.Entry e : h.entrySet())
        {
            if((int)e.getValue() > 1)
            {
                System.out.println(e.getKey()+" Repeats");
            }
            else
            {
                System.out.println(e.getKey()+" Not Repeats");
            }
        }
    }
}
