package oops.arun.aprilsecond.poly;

public class Polymorphism {

	public static void main(String[] args) 
	{
		add(10,20);
		add(10,20,30);
		add(10,20,"Addition of Two numbers");

	}
	public static void add(int a,int b)
	{
		int k=a+b;
		System.out.println("Addition of two numbers integer "+k);
	}
	
	public static void add(int a,int b,int c)
	{
		int k=a+b+c;
		System.out.println("Addition of three numbers "+k);
	}
	public static void add(int a,int b,String c)
	{
		int k=a+b;
		System.out.println("Addition of two numbers string "+c+k);
	}
}
