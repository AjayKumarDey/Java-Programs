package Arrays;

import java.util.Scanner;
// 54 65 78 43 66 33
public class Delete {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,pos,i;
	System.out.println("enter the array size");
	n=sc.nextInt();
	int arr[]=new int[n+1];
	System.out.println("enter the elements");
	for( i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("enter the postion to be delete");
	pos=sc.nextInt();
	for(i=pos;i<n-1;i++)
	{
		arr[i]=arr[i+1];
	}
	
	n--;
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
