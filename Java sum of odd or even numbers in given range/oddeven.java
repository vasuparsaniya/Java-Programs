/* sum of odd or even numbers in given range */

import java.util.Scanner;//Scanner class in java's util package so import
class oddeven
{
	public static void main(String[] args)
	{
		int n,i,sum=0;
		System.out.println("Enter number till you want to print odd number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		if(n%2==0)  //condition for even number
		{
			for(i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.print("Sum of Even numbers in given range is:"+sum);

		}
		else
		{
			for(i=1;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.print("Sum of Odd numbers in given range:"+sum);
		}
	}
}

/*  -->In this case if we enter number first check it is Even or odd if block check number is even 
        and else block check number is odd or not.
	-->number is even then start from 0
	   and number is odd then start from 1
	-->if we enter 14 then 14 is Even number so,
	   sum=0+2+4+6+8+10+12+14=56
	-->if we enter 5 then 5 is odd number so,
	   sum=1+3+5=9
	   */
	   
	  