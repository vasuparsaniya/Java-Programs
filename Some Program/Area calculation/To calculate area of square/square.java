/*Area of square program */
//input as side of square
//formula of sraue=side * side
import java.util.Scanner;
class square
{
	public static void main(String[] args)
	{
		int side,area;
		System.out.println("Enter the value of side:");
		Scanner r=new Scanner(System.in);
		side=r.nextInt();
		area=side * side;
		System.out.println("Area of circle:"+area);
	}
}