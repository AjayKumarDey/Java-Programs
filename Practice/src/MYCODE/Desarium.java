package MYCODE;

import java.util.Scanner;

public class Desarium {
public static void main(String[] args) {
	int rem;
	int count=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int a=n;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		count++;
	}
	n=a;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		sum=(int) (sum+Math.pow(rem, count));
		count--;
	}
	if(sum==a)
	{
		System.out.println("true");
	
		
	}
	else
	{
		System.out.println("false");
	}
	
}
}
