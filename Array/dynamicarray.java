/* dynamic array */
import java.util.Scanner;
class dynamicarray
{
	public static void main(String[] args)
	{
		int size;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=r.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("printed array elements");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}