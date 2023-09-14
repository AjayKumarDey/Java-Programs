import java.util.Scanner;

public class Chessboard {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("start position");
	String x=sc.next();
	System.out.println("end position");
    String y=sc.next();
    
    if(x.charAt(0)==y.charAt(0));
    {
    	System.out.println(0);
    }
     if((x.charAt(0)==y.charAt(0)||x.charAt(1)==y.charAt(1)));
     {
    	 System.out.println("minimun number is moves ");
    	 System.out.println(1);
    	 System.out.println(x+"-->"+y);
     }
    
    {
    System.out.println("minimum number is moves");	
    System.out.println(2);
    System.out.println("1. "+x+"-->"+x.charAt(0)+y.charAt(1));
    System.out.println("minimum number is moves");
    System.out.println("2. "+x.charAt(0)+" "+y.charAt(1)+"-->");
    }
	
}
}
