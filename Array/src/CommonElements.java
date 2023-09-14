
public class CommonElements {
public static void main(String[] args)
{
	int ar[]= {10,30,50,30,10,20};
	int br[]= {20,80,90,10,50,25};
	for (int i = 0; i < ar.length; i++) 
	{
		for (int j = 0; j < br.length; j++) 
	     {
			if(ar[i]==br[j])
			{
				System.out.println(ar[i]+" ");
				break;
			}
		 }
	}
}
}
