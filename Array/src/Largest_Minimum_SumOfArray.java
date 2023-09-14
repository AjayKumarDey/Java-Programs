import java.util.Scanner;

public class Largest_Minimum_SumOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int sum=0;
	System.out.println("enter the array");
	int ar[]=new int[n];
	
	for (int i = 0; i < ar.length; i++)
	{
		ar[i]=sc.nextInt();
	}
	int max=0;
	int min=0;
	for (int i = 0; i < ar.length; i++) 
	{
		if(ar[i]>max)
		{
			max=ar[i];
			sum=sum+ar[i];
			
		}
		
	}
	System.out.println("the largest array is  "+max);
	System.out.println("sum of array is "+sum);
	
}
}
