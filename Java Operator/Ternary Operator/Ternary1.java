/* Ternary operator */
import java.util.Scanner;
class Ternary1
{
	public static void main(String[] args)
	{
		int a,b,c,Max;
		System.out.println("Enter three value:");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		Max=(a>b) ? (a>c ? a:c) : (b>c ? b:c) ;
		System.out.println("Maximum value is:"+Max);
  }

/*  -->In general if condition is true then print :(colon) left side part
	   if condition is false then print :(colon) right side part
*/	   