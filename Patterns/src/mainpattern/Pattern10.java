package mainpattern;

public class Pattern10 {
public static void main(String[] args) {
	char c='1';

	for (int i = 1; i <=5; i++) 
	{
		if(i%2==0)
			c='0';
		
		for (int j = 1; j<=i; j++)
		{
			System.out.print( c+" ");
		}
		c++;
		System.out.println();
	}
}
}
