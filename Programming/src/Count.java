
public class Count {
public static void main(String[] args) {
	String str="james__07@gmail.com";
	int len=str.length();
	int count =0;
	for(int i=0;i<len;i++)
	{
		char ch=str.charAt(i);
		if(ch<'A'&& ch>'Z'||ch<'a'&& ch>'z')
		{
			count++;
		}
	}
	System.out.println(count);
	}
	}
		