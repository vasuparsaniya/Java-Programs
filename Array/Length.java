/* Find the length of array */
import java.util.Scanner;
class Length
{
	public static void main(String[] args)
	{
		int size;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=r.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element of array:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Array element:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Length of array:"+a.length);
	}
}

/*  -->To find the length of array so use "array name.length"*/