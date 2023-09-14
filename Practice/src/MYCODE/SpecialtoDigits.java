package MYCODE;

import java.util.Scanner;

public class SpecialtoDigits {
public static void main(String[] args) {
	int prod=1,sum=0,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int a=n;
	int dig=0;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		sum=sum+rem;
		prod=prod*rem;
 dig=sum+prod;
	}
/*if((sum+prod)==	a)*/
	if(dig==a)
	{
		System.out.println("special two digit number");
	}
	else
	{
		System.out.println("not special two digit number");
	}
	
	
}
}
