package Program;

import java.util.Scanner;

public class ReverseNumber {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int rem,rev=0;
	int n=sc.nextInt();
	
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		
	}
	System.out.println("reverse number is = "+rev);
	
}
}
