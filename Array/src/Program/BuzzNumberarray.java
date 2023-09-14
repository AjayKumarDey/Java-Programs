package Program;

import java.util.Scanner;

//print buzz number and sum of all buz number
public class BuzzNumberarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array no");
		int n=sc.nextInt();
		int sum=0;
		int ar[]=new int[n];
		System.out.println("enter the array");

		for (int i = 0; i < n; i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
					
			if(ar[i]%7==0 || ar[i]%10==7)
			{
				sum=sum+ar[i];
			}

		}
		System.out.println(sum);
}
}
