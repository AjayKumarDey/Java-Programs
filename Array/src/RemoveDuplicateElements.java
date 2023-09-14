
public class RemoveDuplicateElements {
public static void main(String[] args) {
	int ar[]= {10,20,40,30,50,30};
	for (int i = 0; i < ar.length; i++)
	{
		System.out.print(ar[i]+" ");
	}
	 for (int i = 0; i < ar.length; i++)
	 {
		for (int j = i+1; j < ar.length; j++) 
		{
			if(ar[i]==ar[j])
			{
				ar[i]=-1;
			}
		}
	}
	 System.out.println("remove the elements");
	 for (int i = 0; i < ar.length; i++)
	 {
		if(ar[i]!=-1)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
}
