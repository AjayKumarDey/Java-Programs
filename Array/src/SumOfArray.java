import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	System.out.println("enter the array");
	int ar[]=new int[n];
	int sum=0;
	for (int i = 0; i < ar.length; i++)
	{
		ar[i]=sc.nextInt();
	}
	for (int i = 0; i < ar.length; i++)
	{
		sum=sum+ar[i];
	}
	System.out.println(sum);
	
}
}
