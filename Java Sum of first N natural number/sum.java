/* sum of first N natural number */

import java.util.Scanner;
class sum
{
	public static void main(String[] args)
	{
		int n,sum=0;
		System.out.println("Enter no of term:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;//sum+=i;
		}
		System.out.println("ADDITION:"+sum);
	}
}