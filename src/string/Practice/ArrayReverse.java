package string.Practice;

public class ArrayReverse {

	public static void main(String[] args) 
	{
	int[] a={10,100,50,5,500};
	
	int lengthh=a.length;
	
	System.out.println("Length is "+lengthh);
	
	for(int i=0;i<lengthh/2;i++)
	{
		int temp=a[i];
		
		a[i]=a[lengthh-1-i];
		
		a[lengthh-1-i]=temp;
		
	}
	for(int k=0;k<lengthh;k++)
	{
		System.out.println(a[k]);
	}


	}

}
