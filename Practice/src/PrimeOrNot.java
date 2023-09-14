import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ennter the number");
		n=sc.nextInt();
		boolean rs=isPrime(n);


	if(rs)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("not prime number");
	}
			
			
	}

	private static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		return count==2;
	}
}
