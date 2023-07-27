/* Sort array element in ascending order */

import java.util.Scanner;
class Sort
{
	public static void main(String[] args)
	{
		int temp,size;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=r.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Array Element:");
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		/*Using Bubble sort algorithm*/
		System.out.println("----------------sorting through Bubble sort Algorithm-------------");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Element after Bubble sort:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		/*Using Selection sort Algorithm */
		System.out.println("----------------sorting through Selection sort Algorithm-------------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Element after Selection sort:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		/*Using Insertion sort Algorithm */
		System.out.println("----------------sorting through Insertion sort Algorithm-------------");
		
		for(int i=1;i<=a.length-1;i++)   //this for loop select element for particular pass
		{
			int x=a[i];
			int j;
			j=i-1;
			
			while(x<a[j] && j>=0)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=x;
		}
		System.out.println("Element after Insertion sort:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}