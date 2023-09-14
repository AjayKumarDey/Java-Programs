import java.util.Scanner;

public class Natural_Number {
public static void main(String[] args) {
	int sum = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range");
	int n=sc.nextInt();
	for (int i = 0; i <=n; i++)
//	{
//		System.out.println("natural number is "+i);
//	}
	{
		 sum=sum+i;
	}
	System.out.println(sum);
}
}
