/* Find the square root of a number */

import java.util.Scanner;
class squareroot
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter any number:");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		double m=Math.sqrt(n);
		System.out.println("Square root of"+" "+n+" "+"is"+" "+m);
	}
}
