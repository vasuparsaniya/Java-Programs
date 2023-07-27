/*copy array element in other array*/
import java.util.Scanner;
class Copyarray
{
	public static void main(String[] args)
	{
	int size;
	int s;
	Scanner r=new Scanner(System.in);
	System.out.println("Enter the size of first arary:");
	size=r.nextInt();
	System.out.println("Eneter the size of second array:");
	s=r.nextInt();
	int a[]=new int[size];
	int b[]=new int[s];
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

	System.out.println("Second Array element:");
	
	for(int i=0;i<b.length;i++)
	{
		b[i]=a[i];	
		System.out.println(b[i]+" ");
	}
	
}
}

/*  -->Size of first array<= size of second array*/