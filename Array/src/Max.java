import java.util.Scanner;

public class Max {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int n=sc.nextInt();
	System.out.println("enter the elements");
	int ar[]=new int[n];
	int max=ar[0];
	for (int i = 0; i < ar.length; i++) 
	{
		ar[i]=sc.nextInt();
	}
	for (int i = 0; i < ar.length; i++) 
	{
		if(max<ar[i])
		{
			max=ar[i];
		}
	}
	System.out.println("maximum number is "+max);
	
}
}
