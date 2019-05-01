package week_4;

import java.util.Scanner;

public class Greatest_common_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int r = 0;
		
//		int gcd = 1;
//		for(int i = 2; i<=a && i<=b; i++)
//		{
//			if(a % i == 0 && b % i == 0)
//			{
//				gcd = i;
//			}
//		}
		
		while(b!=0)
		{
			r = a%b;
			a = b;
			b = r;
		}
		System.out.println(a);
	}
}
