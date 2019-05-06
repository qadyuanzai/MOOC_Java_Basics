package week_5;

import java.util.Scanner;

public class Greater_than_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cnt = 0;
		cnt = in.nextInt();
		if(cnt>0)
		{
			int[] numbers = new int[cnt];
			double sum = 0.0;
			for(int i = 0; i<cnt; i++)
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			double average = sum/cnt;
			System.out.println(average);
			for(int i = 0; i<numbers.length; i++)
			{
				if(numbers[i]>average)
				{
					System.out.print(numbers[i]+" ");
				}
			}
		}
	}
}
