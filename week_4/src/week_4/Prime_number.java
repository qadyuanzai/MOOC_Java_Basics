package week_4;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2; i<n; i++)
		{
			if(n%i==0)
			{
				isPrime = 0;
				break;
			}
		}
		if(isPrime==1)
		{
			System.out.println("是素数");
		}
		else
		{
			System.out.println("不是素数");
		}
	}

}
