/* Print odd number in given range */

import java.util.Scanner;
class odd
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter number till you want to print odd number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1;i<=n;i=i+2)
		{
			System.out.print(i+" ");
		}
	}
}

/*  -->i=i+2 is give odd number because i start from 1
*/