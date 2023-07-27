/* Area of Triangle */
//take input a,b,c
//1.Find semiperimeter
//2.Area of triangle
import java.util.Scanner;
import java.lang.Math;  //In java Lang package does not recqire to import it is by default import 
class triangle
{
	public static void main(String[] args)
	{
		int a,b,c;
		double sp;  //semiperimeter
		double area;
		System.out.println("Enter value of sides of Triangle:");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();
		
		sp=(a+b+c)/2;
		
		area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));  //squt();  is method of Math class
		System.out.println("Area of Triangle:"+area);
	}
}