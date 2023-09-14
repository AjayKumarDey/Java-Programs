import java.util.Scanner;

public class Array_Maximun {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=sc.nextInt();
	System.out.println("enter the elements");
	
	int ar[]=new int[n];
	int max=ar[0];
	int pos=0;
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	for (int i = 0; i < ar.length; i++)
	{
		if(max<ar[i])
		{
			max=ar[i];
			pos=i;
			break;
		}
	}
	System.out.print(" maximum is "+max+" position is "+(pos+1));
	
	
	
}
}
