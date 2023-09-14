import java.util.Scanner;

public class Replace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len;
	char ch;
	String word="";
	String nword="";
	System.out.println("enter the orginal string");
	String s1=sc.nextLine();
	s1=s1+" ";
	len=s1.length();
	System.out.println("enter the  word");
	String s2=sc.nextLine();
	System.out.println("replace word");
	String s3=sc.nextLine();
	for(int i=0;i<len;i++)
	{
	 ch=s1.charAt(i);
	 if(ch!=' ')
	 {
		 word=word+ch;
	 }
	 else
	 {
		 if(word.equalsIgnoreCase(s2))
		 {
			 nword=nword+" "+s3;
		 }
	    
	    else
	     {
		 nword=nword+" "+word;
	     }
	   word=""; 
	
	}  
	}
	System.out.println(nword);
}
}
