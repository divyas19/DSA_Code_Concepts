import java.io.*;

public class Main
{
  public static void main (String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    int a = Integer.parseInt (br.readLine());
    int arr[] = new int[a];
    int i = 0;
    while (a > 0)
      {
	  int val = a % 2;
	  arr[i] = val;
	  a = a / 2;
	  i++;
      }

    for (int j = i-1;j>=0;j--)
      {
	  System.out.print (arr[j]);
      }
  }
}

