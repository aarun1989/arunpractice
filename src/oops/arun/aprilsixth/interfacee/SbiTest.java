package oops.arun.aprilsixth.interfacee;

public class SbiTest implements RbiTest{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SbiTest sb=new SbiTest();
		sb.credit();
		sb.debit();
sb.loan();

	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Crebit");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan");
	}

}
