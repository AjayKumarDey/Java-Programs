import java.util.Scanner;

public class Range_OddEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
//	for (int i = 1; i <=n; i=i+2)
//	{
//		System.out.println(i);
//	}
//	
	for (int i = 2; i <=n; i=i+2) 
	{
		System.out.println(i);
	}
}
}
