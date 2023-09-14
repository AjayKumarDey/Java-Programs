package Program;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int rev=0,rem;
	int n=sc.nextInt();
	int a=n;
	
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==a)
	{
		System.out.println("palindrome ");
	}
	else
	{
		System.out.println("Not Palindrome ");
	}
	
}
}
