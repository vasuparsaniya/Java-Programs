/*Print array element in rteverse order */
import java.util.Scanner;
class reverse 
{
	public static void main(String[] args)
	{
		int size;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=r.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		
		for(int i=0; i< size;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Array elements:");
		
        for(int i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println("Array element in reverse order:");
		
		for(int i=size-1; i>=0; i--)
		{
			System.out.println(a[i]+" ");
		}
	}  
}