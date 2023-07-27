/* search array element */
import java.util.Scanner;
class Search
{
	public static void main(String[] args)
	{
		int size,n,count=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=r.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Array element:");
		
		for(int i=0;i<a.length;i++)
		{
		    System.out.println(a[i]+" ");

		}
		
		System.out.println("Enter the element which you want to search:");
		n=r.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
			
			if(count>0)
			{
				System.out.println("Element is present in array:");
			}
			else
			{
				System.out.println("Element is not present in array:");

			}
		}
		
	}
