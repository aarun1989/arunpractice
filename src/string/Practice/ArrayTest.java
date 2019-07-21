package string.Practice;

public class ArrayTest {

	public static void main(String[] args) 
	{
		int []a={1,3,2,1,5,3};
		//int j;
		/*for(int i=0;i<=a.length-1;i++)
		{
			for(j=0;j<i;j++)
			{
				if(a[i]==a[j])
					break;
			}
			if(i==j)
			System.out.println(a[i]);
				
		}*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Value"+a[i]);
				}
			}
		}
	}

}
