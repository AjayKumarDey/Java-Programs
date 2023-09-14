
public class SmallestArray {
public static void main(String[] args) {
	int arr[]= {10,30,50,70,5};
	int max=arr[0];
	int min=arr[0];
	
	for (int i = 0; i < arr.length; i++) 
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
		 else if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("smallest "+min);
	System.out.println("biggest "+max);
}
}

