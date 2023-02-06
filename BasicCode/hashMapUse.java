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
