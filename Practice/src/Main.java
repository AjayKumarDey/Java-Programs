import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row");
	int row=sc.nextInt();
	System.out.println("enter the column");
	int column=sc.nextInt();
	String a[][]=new String[row][column]; 
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < a.length; j++)
		{
			a[i][j]=sc.nextLine();
		}
		System.out.println();
		
	}
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++)
		{
	    
		}
	}
}

}
