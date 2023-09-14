package Program;

import java.util.Scanner;

public class ArrayLargestSmallest {
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter the array");
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int max=0;
	int min=0;
	for(int i=1;i<n;i++)
	{
		if(ar[i]>max)
		{
			max=ar[i];
		}
		else
		{
			min=ar[i];
		}
	sum=sum+ar[i];
	}
	System.out.println(max);
	System.out.println(min);
	System.out.println(sum);
}
}
