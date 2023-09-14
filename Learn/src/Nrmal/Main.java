package Nrmal;

public class Main {
public static void main(String[] args) {
	String  c="hello i am practing java";
	if(c.startsWith("h"))
	{
		c=c.trim();
		c.replaceAll("am", "was");
		c=c.substring(3,5);
		byte[] b=c.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println(c);
		
	}
}
}
