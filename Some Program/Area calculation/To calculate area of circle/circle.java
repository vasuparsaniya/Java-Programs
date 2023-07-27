/*Area of circle program */

import java.util.Scanner;
class circle
{
	public static void main(String[] args)
	{
		int r;
		int a=22,b=7;
		final double PI=(a/b);  //PI is final variable
		double area;
		System.out.println("Enter radius of circle:");
		Scanner ref=new Scanner(System.in);
		r=ref.nextInt();
		area=PI*r*r;
		System.out.println("Area of circle is:"+area);
	}
}