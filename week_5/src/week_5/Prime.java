package week_5;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] primes = new int[50];
		primes[0] = 2;
		int cnt = 1;
		int x = in.nextInt();
		boolean isPrime = true;
		if(x!=2&&x%2==0)
		{
			isPrime = false;
		}
		else
		{
			for(int i = 3; i<Math.sqrt(x); i += 2)
			{
				if(x%i==0)
				{
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println(isPrime);
		}
	}

}
