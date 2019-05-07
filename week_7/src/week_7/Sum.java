package week_7;

public class Sum {
	public static void sum(int a, int b)
	{
		int sum = 0;
		for(; a<=b; a++)
		{
			sum+=a;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,10);
		sum(20,30);
	}
}
