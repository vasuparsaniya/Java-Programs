/*check number is positive or negative */
//input n>0 +Ve number
//input n<0 -Ve number
//input n=0 neither positive nor Negative 

import java.util.Scanner;
class check
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter any number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		if(n>0)
		{
			System.out.println("number is Positive");
		}
		else if(n<0)
		{
			System.out.println("number is Negative");
		}
		else  //n=0
		{
			System.out.println("number is Neither positive nor Negative");
		}
	}
}