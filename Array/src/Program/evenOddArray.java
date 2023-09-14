package Program;

import java.util.Scanner;

public class evenOddArray {
	public static void main(String[] args) {
		
	int esum=0;
	int osum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array no");
	int n=sc.nextInt();
	int ar[]=new int[n];
	
	System.out.println("enter the array");
	
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
		if(ar[i]%2==0)
			esum=esum+ar[i];
		else
			osum=osum+ar[i];
	}
	System.out.println(esum);
	System.out.println(osum);
	
}
}
