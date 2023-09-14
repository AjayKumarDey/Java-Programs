import java.util.Scanner;

public class Desktop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st number");
	int a=sc.nextInt();
	System.out.println("Enter the 2nd number");
	int b=sc.nextInt();
	if(a==b)
	{
		System.out.println("both are equal");
	}
	else 
	{
		System.out.println("both are not equal");
	}
}
}
