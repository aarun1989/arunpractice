package oops.arun.aprilsxith.encapsulation;

public class EncapRun {

	public static void main(String[] args) 
	{
		EncapTest en=new EncapTest();
		en.setamount(1000);
		en.setaccount(123456);
		en.setname("Arun");
		System.out.println(en.name());
		System.out.println(en.getaccount());
		System.out.println(en.getamount());
	}

}
