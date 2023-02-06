import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enetr the number");
    int num = sc.nextInt ();
    int n = num;

    int rem = 0;
    int sum = 0;
    while (n > 0)
      {
	rem = n % 10;
	sum = sum * 10 + rem;
	n = n / 10;
      }
    if (num == sum)
      {
	System.out.println ("Is Palindrome:");
      }
    else
      {
	System.out.println ("Not a Palindrome:");
      }
  }
}

