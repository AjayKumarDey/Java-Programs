import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for (int i= 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("after reverse");
		for (int i = a.length-1; i >=0; i--) 
		{
			System.out.print(a[i]+" ");
		}
		
	}
	}


