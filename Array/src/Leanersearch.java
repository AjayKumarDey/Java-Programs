import java.util.Scanner;

public class Leanersearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter the array");
	for(int i=0;i<ar.length;i++)
	{
		ar[n]=sc.nextInt();
	}
	System.out.println("enter the searched element");
	int key=sc.nextInt();
	int flag=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]==key)
		{
			flag++;
			break;
			
		}
	}
	if(flag==1)
	{
		System.out.println("element found");
	}
	else
	{
		System.out.println("element not found");
	}
	
}
}
