
public class OddEven {
public static void main(String[] args) {
	int ar[]= {23,5,43,76,8,14};
System.out.println("even number in the array");
	for (int i = 0; i < ar.length; i++) 
	{
		if(ar[i]%2==0)
		{
			System.out.println(ar[i]);
		}
	
	}
	System.out.println("odd number in the array");
	for (int i = 0; i < ar.length; i++)
	{
		if(ar[i]%2!=0)
		{
			System.out.println(ar[i]);
	}
		
}

}
}