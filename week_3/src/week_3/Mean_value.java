package week_3;

import java.util.Scanner;

public class Mean_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int sum = 0;
		int count = 0;
		Scanner in = new Scanner(System.in);
		number = in.nextInt(); 
		while(number!=-1)
		{
			sum = sum + number;
			number = in.nextInt();
			count = count +1;
		}
		if(count>0)
		{
			System.out.println((double)sum/count);
		}
	}

}
