/*Arrays class methods(static) equals()*/
import java.util.Scanner;
import java.util.Arrays;

class Equalsmethod
{
	public static void main(String[] args)
	{
		Scanner r=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter Array Element:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Enter Element in second array:");
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=r.nextInt();
		}
		
		//equals() method
		
		boolean c=Arrays.equals(a,b);
		System.out.println("Both Arrays is Equal?"+c);
		
	}
}