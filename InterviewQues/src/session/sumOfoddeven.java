package session;

import java.util.Scanner;

public class sumOfoddeven {
public static void main(String[] args) {
	int n,sum=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	if(n%2==0)
	{
		for ( i = 0; i <=n; i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("sum of even is = "+sum);
	}
	else
	{
		for (i = 1; i<=n; i=i+2) 
		{
			sum=sum+i;
		}
		System.out.println("sum of odd is = "+sum);
	}
	
		
}
}
