Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		boolean isPrime[] = sieveOfEratoSthenes(15);
		for(int i =0; i<= 15;i++)
		System.out.println(i+" "+isPrime[i]);
	}
	
	static boolean[] sieveOfEratoSthenes(int n)
	{
	    boolean isPrime[] = new boolean[n+1];
	    Arrays.fill(isPrime,true);
	    isPrime[0] = false;
	    isPrime[1] = false;
	    for(int i = 2; i*i <=n;i++)
	    {
	        for(int j = i*2; j<=n;j+=i)
	        {
	            isPrime[j] = false;
	        }
	    }
	    return isPrime;
	}
}
