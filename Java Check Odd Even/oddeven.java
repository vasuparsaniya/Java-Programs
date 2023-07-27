/* check Odd Even */

import java.util.Scanner;
class oddeven
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter any number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		if(n%2==0)
		{
			System .out.println("Even Number");
		}
		else
		{
			System.out.println("odd Number");
		}
	}
}

/*  -->n%2==0 then n is Even
    -->n%2==1 then n is Odd
*/