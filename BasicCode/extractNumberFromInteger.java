import java.io.*;

public class Main
{
  public static void main (String args[]) throws IOException
  {
    BufferedReader br =
      new BufferedReader (new InputStreamReader (System.in));
    int a = Integer.parseInt (br.readLine());
    while (a > 0)
      {
	  int val = a % 10;
	  System.out.println (val);
	  a = a / 10;
      }
  }
}

