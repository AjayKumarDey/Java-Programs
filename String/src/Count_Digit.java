import java.util.Scanner;

public class Count_Digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String st=sc.nextLine();
	int count=0;
	//st=st+' ';
	for (int i = 0; i <st.length(); i++)
	{
		char ch=st.charAt(i);
		//if(ch==' ')
			count++;
			
	}
	System.out.println((count)+"  character is there  ");
}
}
