/* different way to print dynamic array */
import java.util.Scanner;
class Dynamicprintarray
{
	public static void main(String[] args)
	{
		int size;
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=ref.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the element of array");
		for(int i=0; i<size; i++)
		{
			a[i]=ref.nextInt();
		}
		System.out.println("Print element of array with help of for loop");
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println("Print element of array with help of for each loop");
		for(int b : a)
		{
			System.out.println(b);
		}
	}
}