/* compare Arrays */
// Using == operator
// equals() method
import java.util.Arrays;
import java.util.Scanner;
class comparearray
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int b[]=new int[5];     
		
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the first array elements:");
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Enter the second array element:");
		
		for(int i=0; i<b.length;i++)
		{
			b[i]=r.nextInt();
		}
		
		//using == operator
		System.out.println("********************Using == operator compare both array*****************");
		if(a==b)
		{
			System.out.println("Both are equals");
		}
		else
		{
			System.out.println("Both are not equals");
		}
		
		//using equals() method
		System.out.println("********************Using equals() method compare both array*****************");
		if(Arrays.equals(a,b))
		{
			System.out.println("Both are equals");
		}
		else
		{
			System.out.println("Both are not equals");
		}
	}
}

/* == operato check only both array reference variable is same or not 
  -->If element is same but reference variable is not same then both array is not same
  equals() method check both array element is same or not
*/