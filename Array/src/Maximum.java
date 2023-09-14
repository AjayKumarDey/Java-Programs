import java.util.Scanner;

public class Maximum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size=sc.nextInt();
	int ar[]=new int[size];
	int max=ar[0];
	for (int i = 0; i < ar.length; i++) 
	{
		ar[i]=sc.nextInt();
	}
	for (int i = 0; i < ar.length; i++) 
	{
	  if(ar[i]>max)
	  {
		  max=ar[i];
	  }
	}
	System.out.println("maximum number is :"+max);
	
}
}
