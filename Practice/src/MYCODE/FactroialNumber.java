package MYCODE;

import java.util.Scanner;

public class FactroialNumber {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int prod=0,rem;
	while(n>0)
	{
		rem=n%10;
		prod=rem*prod;;
		n=n/10;
	}
	System.out.println(prod);
	
}
}
