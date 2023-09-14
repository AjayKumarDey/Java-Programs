import java.util.Scanner;

public class Insert_Element {
public static void main(String[] args) {
	int pos,ele;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of elements");
	int size=sc.nextInt();
	System.out.println("enter the array");
	int ar[]=new int[size+1];
	for (int i = 0; i < size; i++) 
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("enter the position of element");
	pos=sc.nextInt();
	System.out.println("enter the element");
	ele=sc.nextInt();
	for (int i = size-1; i>pos;i--)
	{
		ar[i+1]=ar[i];
	}
ar[pos]=ele;
size=size+1;
System.out.println("after inserted.......");
for (int i = 0; i < ar.length; i++) {
	System.out.print(ar[i]+" ");
}
	
	
	
}
}
