import java.util.Scanner;

public class WordReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String s="";
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
		  int p=i;
		  while(i<ch.length&&ch[i]!=' ')
		  {
			  i++;
		  }
		  int n=i-1;
		  while(n>=p)
		  {
			  s=s+ch[n];
			  n--;
		  }
			  if(i<ch.length)
			  {
				  s=s+ch[i];
			  }
		  }
		  System.out.println(s);
		}

}
