import java.util.Iterator;
import java.util.Scanner;

public class LastWordCapital {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String st=sc.next();
	String rev="";
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		int f=i;
		while(i<ch.length && ch[i]!=' ')
		{
			i++;
		}
		int l=i-1;
	while(l>f)
	{
		rev=rev+ch[i];
		l--;
	}
	if(i<ch.length)
		rev=rev+ch[i];
	}
	System.out.print(rev);
}
}
