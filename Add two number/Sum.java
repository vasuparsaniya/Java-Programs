/* Sum of two numbers */

import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		int a,b;
		System.out.println("Enter two numbers:");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		
		System.out.println("Sumof two numbers:"+(a+b));
	}
}