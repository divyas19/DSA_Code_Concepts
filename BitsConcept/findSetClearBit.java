Find or Set or Clear ith Bit.
  
import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String args[])
  {
    int n = 11001011;
    int k = 2;
    //Find 3rd bit from last
    System.out.println (n & (1 << k));

    //Set 3rd bit from last
    int m = 10;
    //m = 1010
    System.out.println((1<<k)|m);
    //output 14 1110

    //Clear 3rd bit from last
    int mask = ~(1 << k);
      System.out.println (m & mask);
      //output 10 1010
  }
}
