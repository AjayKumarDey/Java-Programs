package mainpattern;

public class Pattern12 {
public static void main(String[] args) {
	String st="ABHIMANYU";
	for (int i = 0; i <st.length(); i++) 
   {
		for (int j = 0; j <=i; j++) 
		{
			System.out.print(st.charAt(j)+" ");
		}
		System.out.println();
	}
	for (int i = st.length()-1; i>=0; i--) 
	   {
			for (int j = 0; j <i; j++) 
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
}
}
