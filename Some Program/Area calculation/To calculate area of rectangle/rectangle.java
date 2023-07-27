/*Area of rectangle Program */
//input length and breath
import java.util.Scanner;
class rectangle
{
	public static void main(String[] args)
	{
		int l,b,area;
		System.out.println("Enter value for sides:");
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
		area=l*b;
		System.out.println("Area of rectangle is:"+area);
	}
}