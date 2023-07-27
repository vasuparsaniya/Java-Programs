/*Arrays class methods(static) copyof()*/

import java.util.Scanner;
import java.util.Arrays;

class Copyofmethod
{
	public static void main(String[] args)
	{
		Scanner r=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Array Element:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		//copyof() method
		
		int d[]=Arrays.copyOf(a,5);  //in this parameter of method give Which array element copy and size of new array
		System.out.println("Second array element:");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]+" ");
		}
	}
}
