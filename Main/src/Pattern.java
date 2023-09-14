
public class Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++)
		{
			for (int j = i; j <=5; j++) 
			{
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print(k+" ");
			}
			for (int k = 1; k <=i-1; k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for (int i = 5-1; i>=1; i--)
		{
			for (int j = i; j <=5; j++) 
			{
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print(k+" ");
			}
			for (int k = 1; k <=i-1; k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
