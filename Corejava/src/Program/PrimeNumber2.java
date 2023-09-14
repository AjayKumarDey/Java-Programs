package Program;

import java.util.Scanner;

public class PrimeNumber2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	int n=sc.nextInt();
	for(int i=2;i<=n-1;i++)
	{
		if(n%i==0)
			count++;
	}
	if(count==0)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("not prime number");
	}
}
}
