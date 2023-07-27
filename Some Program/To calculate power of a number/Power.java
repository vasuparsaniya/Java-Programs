/*calculate power of number */

import java.util.Scanner;
class Power
{
	public static void main(String[] args)
	{
		int n,p,result=1;
		System.out.println("Enter Number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		System.out.println("Enter power:");
		p=r.nextInt();
		
		for(int i=1;i<=p;i++)
		{
			result=result*n;
		}
		System.out.println("power of a number:"+result);
	}
}