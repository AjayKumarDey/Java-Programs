import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a,dig,rev=0;
	int n=sc.nextInt();
	a=n;
	while(n>0)
	{
		dig=n%10;
		n=n/10;
		
		rev=rev*10+dig;
	}
	if(rev==a)
	{
		System.out.println("palindrome ");
	}
	else
	{
		System.out.println("not palindrome");
	}
	
	
	
}
}
