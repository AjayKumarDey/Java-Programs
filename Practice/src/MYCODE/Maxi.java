package MYCODE;

import java.util.Scanner;

public class Maxi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int n=sc.nextInt();
	System.out.println("enter the array");
	int ar[]=new int[n];
	for (int i = 0; i < ar.length; i++) 
	{
		ar[n]=sc.nextInt();
	}
	for (int i = 0; i < ar.length; i++) 
	{
		for (int j = i+1; j < ar.length; j++)
		{
			if (ar[i]>ar[j])
					{
				    ar[i]=ar[j];
					}
			
		}
		System.out.println(ar[i]+" ");
	}
	
}
}
