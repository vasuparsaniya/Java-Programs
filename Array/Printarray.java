/* different ways to print static arrays elements */

class Printarray
{
	public static void main(String[] args)
	{
		int a[]=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//first way(for loop)
		System.out.println("Help of for loop");
		for(int i=0; i<3; i++)
		{
			System.out.println(a[i] + " ");
		}
		
		//second way(for each loop)
		System.out.println("Help of for each loop");
		for(int b : a)
		{
			System.out.println(b);
		}
	}
}