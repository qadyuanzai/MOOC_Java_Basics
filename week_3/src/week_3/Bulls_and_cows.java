package week_3;

import java.util.Scanner;

public class Bulls_and_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);
		int a= in.nextInt();
		int count = 1;
		while(a!=number)
		{
			if(a>number)
			{
				System.out.println("大了");
			}
			else
			{
				System.out.println("小了");
			}
			a = in.nextInt();
			count = count +1;
		}
		System.out.println("恭喜你猜对了，用了"+count+"次");
	}

}
