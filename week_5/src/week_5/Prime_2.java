package week_5;

public class Prime_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] isPrime = new boolean[100];
		for(int i=0; i<isPrime.length; i++)
		{
			isPrime[i] = true;
		}
		for(int i = 2; i<isPrime.length; i++)
		{
			if(isPrime[i])
			{
				for(int j = 2; i*j<isPrime.length; j++)
				{
					isPrime[i*j] = false;
				}
			}
		}
		for(int i = 2; i<isPrime.length; i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
