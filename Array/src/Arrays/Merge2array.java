package Arrays;

import java.util.Scanner;

public class Merge2array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size1,size2,i;
	System.out.println("enter the size of array1");
	size1=sc.nextInt();
	System.out.println("enter the size of array2");
	size2=sc.nextInt();
	int ar1[]=new int[size1];
	int ar2[]=new int[size2];
	int ar3[]=new int[size1+size2];
	System.out.println("enter the elements of array1");
	for(i=0;i<size1;i++)
	{
		ar1[i]=sc.nextInt();
	}
	System.out.println("enter the elements of array 2");
	for(i=0;i<size2;i++)
	{
		ar2[i]=sc.nextInt();
	}
	for(i=0;i<size1;i++)
	{
		ar3[i]=ar1[i];
	}
	
	for(i=0;i<size2;i++)
	{
		ar3[size1+i]=ar2[i];
	}
	for (int j = 0; j < ar3.length; j++)
	{
		System.out.print(ar3[j]+" ");
	}
	
}
}
