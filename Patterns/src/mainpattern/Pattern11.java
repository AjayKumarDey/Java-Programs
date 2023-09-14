package mainpattern;

public class Pattern11 {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) 
	{
		
		for (int k = i; k <=5; k++) 
		{
			System.out.print("  ");
		}
		for (int j = 1; j <=i; j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	for (int i = 4; i >=1; i--) 
	{
		for (int k = i; k <=5; k++) 
		{
			System.out.print("  ");
		}
		for (int j = 1; j <=i; j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
}
