package oops.arun.aprilsecond.poly;

public class ChildOverride extends ParentOverride
{
	public static void main(String[] args) 
	{
	ChildOverride ch=new ChildOverride();
	ch.exe();
	}
	public static void add()
	{
		System.out.println("Child Override ADD Function");
	}
	public void exe()
	{
		super.add();
		add();
		ChildOverride.add();
	}
}
