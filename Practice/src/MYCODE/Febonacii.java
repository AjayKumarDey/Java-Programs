package MYCODE;

import java.util.Scanner;

public class Febonacii {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=0,b=1,c;
	 
	for(int i=1;i<=n;i++)
	{
		System.out.print(a+" ");
		c=a+b;
		  a=b;
		  b=c;
		
		
		
	}
	
}
}
