/*calculate average of five subject */

import java.util.Scanner;
class subject
{
	public static void main(String[] args)
	{
		int a,b,c,d,e;
		System.out.println("Enter the marks of five subject:");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();
		d=r.nextInt();
		e=r.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("Toatal of five subject:"+sum);
		
		double avg=sum/5.0;
		System.out.println("Average of five subject:"+avg);
	}
}