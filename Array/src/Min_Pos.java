import java.util.Scanner;

public class Min_Pos {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	int pos=0;
int min=ar[0];

	System.out.println("enter the elements");
	for (int i = 0; i < ar.length; i++)
	{
		ar[i]=sc.nextInt();
	}
	for (int i = 0; i < ar.length; i++)
	{
		
		if(min>ar[i])
		{
			min=ar[i];
			pos=i;
		}
	}
	System.out.println("the small number is "+min+" and position is "+(pos+1));
}
}
