

public class Selection {

	public static void main(String[] args) {
		int arr[]= {43,23,2,7,12,10};
		for(int i=0;i<arr.length;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j])
					index=j;
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
					
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
