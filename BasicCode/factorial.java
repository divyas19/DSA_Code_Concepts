import java.util.*;
import java.io.*;

public class Main
{
    static int factorial(int n)
    {
        if(n==0||n==n-1)
        return 1;
        
        return n*factorial(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		
	}
}

