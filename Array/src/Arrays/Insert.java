package Arrays;

import java.util.Scanner;
// 54 65 78 43 66 33
public class Insert {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,pos,ele,i;
	System.out.println("enter the array size");
	n=sc.nextInt();
	int arr[]=new int[n+1];
	System.out.println("enter the elements");
	for( i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the elements to be insert");
	ele=sc.nextInt();
	System.out.println("enter the postion to be insert");
	pos=sc.nextInt();
	for(i=n-1;i>=pos;i--)
	{
		arr[i+1]=arr[i];
	}
	arr[pos]=ele;
	n=n+1;
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
