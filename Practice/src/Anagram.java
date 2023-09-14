import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1 string ");
		String s1=sc.next();
		System.out.println("enter the 2 nd string ");
		String s2=sc.next();
		boolean rs=Anagram(s1,s2);
		if(rs)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
	}

	private static boolean Anagram(String s1, String s2) {
			int ch1[]=countFreq(s1);
			int ch2[]=countFreq(s2);
			for(int j=0;j<26;j++)
				if(ch1[j]!=ch2[j])
					return false;
		return true;
	}

	private static int[] countFreq(String s1) {
		// TODO Auto-generated method stub
		return null;
	}
}
