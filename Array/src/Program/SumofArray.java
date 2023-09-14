package Program;

import java.util.Iterator;
import java.util.Scanner;

public class SumofArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array no");
	int n=sc.nextInt();
	int sum=0;
	int prod=1;
	int ar[]=new int[n];
	System.out.println("enter the array");

	for(int i=0;i<n;i++)
	{
				ar[i]=sc.nextInt();
	}
	for (int i = 0; i <n; i++) 
	{
		sum=sum+ar[i];
		prod=prod+ar[i];
	}
	System.out.println(sum);
	System.out.println(prod);
	
}
}
