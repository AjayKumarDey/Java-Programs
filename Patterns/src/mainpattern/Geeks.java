package mainpattern;

import java.util.Scanner;

class Geeks{
    public static void main(String[] args) {
		String n="dey";
		String m="ajay";
		
	String p=	n.concat(m);
	String rev="";
	for (int j = p.length()-1;j>=0;j--)
	{
		
	
  rev+=p.charAt(j);
  
	}	
	System.out.println(rev);
	}
}
    
	