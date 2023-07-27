/* if-else statement */

import java.util.Scanner;

class ifelse
{
	public static void main(String[] args)
	{
		
		int n;
		System.out.print("Enter any number:\n");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		if(n>=0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}
}

/*  -->In this program if block statement is false then execute else statement
*/