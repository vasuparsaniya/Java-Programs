/*Arrays class methods(static) sort()*/
import java.util.Scanner;
import java.util.Arrays;

class Sortmethod
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
		
		//sort() method
		
		Arrays.sort(a);
		System.out.println("Sorted array element:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}