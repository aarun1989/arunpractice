package string.Practice;

public class SwapStringsWithoutTempVariable 
{
	public static void main(String[] args) 
	{
		String a="Hello";
		
		String b="Arun";
		
		a=a+b;
		
		System.out.println(a);
		
		System.out.println("length of A string"+a.length());
		
		System.out.println("Length of B string"+b.length());
		
		b=a.substring(0, a.length()-b.length());
		
		System.out.println("Value of b"+b);
		
		a=a.substring(b.length());
		
		System.out.println(a);
		
		System.out.println("String after swap a="+a+"b="+b);

	}

}
