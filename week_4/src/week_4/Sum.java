package week_4;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0.0;
		int sign = 1;
		for(int i = 1; i<=n; i++)
		{
			sum += sign*1.0/i;
			sign = sign * -1;
		}
		System.out.printf("%.2f", sum);
	}

}
