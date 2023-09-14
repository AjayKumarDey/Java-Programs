
import java.util.Scanner;

public class Marge_Element {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st array");
	int size1=sc.nextInt();
	System.out.println("enter the 2nd array");
	int size2=sc.nextInt();
	int ar1[]=new int[size1];
	
	int ar2[]=new int[size2];
	int ar3[]=new int[size1+size2];
	for (int i = 0; i < ar3.length; i++)
	{
	ar3[i]=	ar1[i]+ar2[i];
	}
	for (int i = 0; i < ar3.length; i++) 
	{
		System.out.println(ar3[i]+" ");
	}
	
}
}
