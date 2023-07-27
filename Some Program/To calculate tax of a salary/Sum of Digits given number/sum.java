/* Sum of Digits */

import java.util.Scanner;
class sum
{
	public static void main(String[] argsn)
	{
		int n,r,sum=0;
		System.out.println("Enter any number:");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits:"+sum);
	}
}