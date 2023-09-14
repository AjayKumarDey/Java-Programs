import java.util.Scanner;

public class Smallest
{
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array");
int n=sc.nextInt();
int a[]=new int[n];
for (int i = 0; i < a.length; i++) {
	a[i]=sc.nextInt(); 
}

for (int i = 0; i < a.length; i++)
  {
	for (int j = 1; j < a.length; j++)
	{
		if(a[j-1]>a[j])
		{
			int temp=a[j-1];
			a[j-1]=a[j];
			a[j]=temp;
		}
	}

  }
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}
}
}