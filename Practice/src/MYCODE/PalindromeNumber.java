package MYCODE;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	int n=121,rem;
	int rev=0;
	int a=n;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;  
		n=n/10;
		
	}
	if(a==rev)
	{
		System.out.println("palindrome ");
	}else
	{
		System.out.println("not palindrome");
	}
}
}
