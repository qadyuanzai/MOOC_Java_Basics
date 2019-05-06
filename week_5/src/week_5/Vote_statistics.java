package week_5;

import java.util.Scanner;

public class Vote_statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] a = new int[10];
		while(number!=-1)
		{
			if(number>-0 && number<=9)
			{
				a[number]++;
			}
			number = in.nextInt();
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
