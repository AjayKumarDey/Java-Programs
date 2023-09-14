import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("prime ");
	}
	else
	{
		System.out.println("not prime");
	}
}
}
