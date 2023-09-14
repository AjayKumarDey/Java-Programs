import java.util.Scanner;

public class CommonNumber {
  public void number(int n )
  {
	  int d=6,n1=2876966;
	  int dig,count = 0;
	  while(n1>0)
	  {
		  dig=n1%10;
		  if(dig==d)
		   count++;
		  n1=n1/10;
		 
	  }
	  System.out.println(count+"times =  "+d);
  }
  public static void main(String[] args) {

	CommonNumber cn=new CommonNumber();
	cn.number(2);
}
}
