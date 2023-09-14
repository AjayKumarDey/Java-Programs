import java.util.Scanner;

public class Bubblesortt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element no");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int temp;
	for (int i = 0; i < ar.length; i++) 
	{
		for (int j = 0; j < ar.length-1; j++)
		{
			if(ar[j]>ar[j+1])
			{
			temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
			}
		}
	}
	for (int i = 0; i < ar.length; i++) {
		System.out.print(ar[i]+" ");
	}
}
}
