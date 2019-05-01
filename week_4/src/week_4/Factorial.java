package week_4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int factor = 1;
		if(n==0)
		{
			factor = 0;
		}
		for(int i = 1; i<=n; i++)
		{
			factor = factor *i;
		}
		System.out.println(factor);
	}

}
