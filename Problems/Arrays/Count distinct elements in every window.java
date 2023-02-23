import java.io.*;
import java.util.*;

public class Main
{

  static ArrayList < Integer > subArray (int[]A, int N, int K)
  {

        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i< K;i++)
        {
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        al.add(hm.size());
        for(int i = K; i< N;i++)
        {
            if(hm.get(A[i-K]) == 1)
            hm.remove(A[i-K]);
            else 
            hm.put(A[i-K],hm.getOrDefault(A[i-K],0) -1);
            
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            al.add(hm.size());
        }
        return al;
    
  }
  
  public static void main (String args[])
  {
    int A[] = { 2, -3, 0, 3 ,3};
    int K = 3;
      ArrayList<Integer> res = subArray(A, A.length, K);             
      for(int i = 0;i<res.size();i++)                
      System.out.print(res.get(i) + " ");             
          
    
  }
}
