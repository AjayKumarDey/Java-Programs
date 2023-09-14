
public class Str {
	public static void main(String[] args) {
		String st="ajay";
		String rev="";
		for (int i = st.length()-1; i >=0; i--)
		{
			rev=rev+st.charAt(i);
			
		}
		System.out.println(rev);
	}

}
