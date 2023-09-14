package MYCODE;

import java.util.Scanner;

//153=1*1*1+5*5*5+3*3*3=153
public class Armstrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int a=n;
	int dig,sum=0;
	while(n>0)
	{
		dig=n%10;
		n=n/10;
		sum=sum+dig*dig*dig;
	}
	if(a==sum)
	{
		System.out.println("armstrong number");
	}
	else
	{
		System.out.println("not armstrong number");
	}
	
}
}
