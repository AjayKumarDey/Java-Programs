
public class SelectionSort {
public static void main(String[] args) {
	String[] s= {"ajay","rahul","vivek","suresh"};
	String temp="";
	for (int i = 0; i < s.length; i++)
	{
		int asc=i;
		for (int j = i+1; j < s.length; j++) 
		{
			if(s[j].compareTo(s[asc])<0)
			{
				asc=j;
			}
		}
		temp=s[i];
		s[i]=s[asc];
		s[asc]=temp;
	}
	for (int i = 0; i < s.length; i++) {
		System.out.print(s[i]+" ");
	}
}
}
