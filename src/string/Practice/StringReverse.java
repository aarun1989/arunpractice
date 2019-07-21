package string.Practice;

public class StringReverse {

	public static void main(String[] args) 
	{
	
		String s="arunisgood";
		
		int len=s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
