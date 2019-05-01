package week_4;

public class Prime_numbers_within_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=100; i++)
		{
			boolean isPrime = true;
			for(int j = 2; j<i; j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i+" ");
			}
		}
	}

}
