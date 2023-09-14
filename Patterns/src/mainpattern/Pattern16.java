package mainpattern;

public class Pattern16 {
public static void main(String[] args) {
	int k=1;
	for (int i = 1; i <=5; i++)
	{
		for (int j = 1; j <=5; j++) 
		{
			System.out.print((char)(k+64)+" ");
			k++;
		}
		System.out.println();
	}
}
}
