
import java.util.Scanner;

public class BubbleInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int ar[]=new int[n];

	for (int i = 0; i < ar.length; i++) 
	{
		ar[i]=sc.nextInt();
}
	for (int i = 0; i < ar.length; i++) {
	
		for (int j = 0; j < ar.length-1-i; j++)
		{
			if(ar[j]<ar[j+1])
			{
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
		
			}
		}
		
	}
	System.out.println(ar[0]+" ");
for (int i = 0; i < ar.length; i++) 
	{
		System.out.print(ar[i]+" ");
	}
}
}
