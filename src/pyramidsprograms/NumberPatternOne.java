package pyramidsprograms;

public class NumberPatternOne {

	public static void main(String[] args) 
	{

		/*
		 *
		 **
		 ***
		 ****
		 row=4
		 column=4
		 */

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------");


		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------");


		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}


		System.out.println("-----------------------");

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
