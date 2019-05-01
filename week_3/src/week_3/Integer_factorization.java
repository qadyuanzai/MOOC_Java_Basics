package week_3;

import java.util.Scanner;

public class Integer_factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int digit= 0;
		int result = 0;
		while(number>0)
		{
			digit = number % 10;
			number = number / 10;
			result = result * 10 + digit;
		}
		System.out.println(result);
	}
}
