package Arrays;

import java.util.Scanner;

public class Bubble {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("unsortedd");
	for(int i=0;i<n;i++)
	{
		System.out.print(ar[i]+" ");
	}
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1;j++)
		{
		if(ar[j]>ar[j+1])
		{
		 int temp=ar[j];
		ar[j]=ar[j+1];
		ar[j+1]=temp;
		}	
	}
}
	System.out.println("sorted are");
	for(int i=0;i<n;i++)
	{
		System.out.print(ar[i]+" ");
	}
	
	
}
}
