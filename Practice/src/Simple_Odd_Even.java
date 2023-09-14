import java.util.Scanner;

public class Simple_Odd_Even {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	if(n%2==0)
	{
		System.out.println("even number is :"+n);
	}
	else
	{
		System.out.println("odd number is :"+n);
	}
}
}
