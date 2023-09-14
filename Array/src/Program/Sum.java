package Program;

import java.util.Scanner;

// orginal array
//
public class Sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;int prod=1;int esum=0;int osum=0;
	int ar[]=new int[5];
	System.out.println("enter an array ");
	for(int i=0;i<5;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<5;i++)
	{
		System.out.print(ar[i]+" ");
		sum=sum+ar[i];
		prod=prod+ar[i];
		if(ar[i]%2==0)
		{
			esum=esum+ar[i];
		}
		else
		{
			osum=osum+ar[i];
		}
		
	}

	System.out.println();
	System.out.println(sum);
	System.out.println(prod);
	System.out.println(esum);
	System.out.println(osum);
	}
}
