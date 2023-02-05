import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String args[])
  {
    int a = 90;
    int b = 89;
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
      System.out.println ("a = " + a + ", b = " + b);
  }
}
