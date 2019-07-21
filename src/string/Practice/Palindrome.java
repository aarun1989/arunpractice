package string.Practice;

public class Palindrome {

	public static void main(String[] args) {

		String s="MAAM";
		int i;
		int start=0;
		int end=s.length()-1;
		int middle=(start+end)/2;
		for(i=start;i<=middle;i++)
		{
			if(s.charAt(start)==s.charAt(end))
			{
				System.out.println(s.charAt(start));
				System.out.println(s.charAt(end));
				start++;
				end--;
			}
			else
			{
				break;
			}
			//System.out.println(s.charAt(i));
		}
		if(i==middle+1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");
		}
	}

}
