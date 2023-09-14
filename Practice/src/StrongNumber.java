
public class StrongNumber {
	public static void main(String[] args) {
		int n=145;
		boolean rs=strong(n);
		if(rs)
			System.out.println("SN");
		else
			System.out.println("NSN");
	}

	private static boolean strong(int n) 
	{
		int temp=n,sum=0;
		while(n!=0)
		{
			int d=n%10;
			int f=fact(d);
			n=n/10;
			sum=sum+f;
		}
		return temp==sum;
	}

	private static int fact(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
}
