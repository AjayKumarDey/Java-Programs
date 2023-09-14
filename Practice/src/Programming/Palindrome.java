package Programming;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	int p=n;
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	if(p==sum)
	{
		System.out.println(sum+" is Palindrome number  ");
	}
	else
	{
		System.out.println(sum+"   is not palindrome ");
	}
}
}
