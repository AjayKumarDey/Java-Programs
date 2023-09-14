package session;

public class PrintontToHundred {

	public static void print(int num)
	{
		if(num<=100)
		{
		System.out.println(num);
		num++;
		print(num);
		
	}
	}
	public static void main(String[] args) {
		print(1);
	}
}
    