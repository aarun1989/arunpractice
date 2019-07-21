package oops.arun.aprilsixth.interfacee;

public class SampleTest implements RbiTest{

	public static void main(String[] args) 
	{
	SampleTest st=new SampleTest();
	st.exe();
	st.credit();
	st.debit();
	st.loan();
	}
	
	public void exe()
	{
		System.out.println("SampleTest Executed");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit Executed");
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Crebit Executed");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan Executed");
	}

}
