/* Eligible for vote or not */
import java.util.Scanner;
class vote
{
	public static void main(String[] args)
	{
		int age;
		System.out.println("Enter your age:");
		Scanner r=new Scanner(System.in);
		age=r.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible for vote");
		}
		else
		{
			System.out.println("You are not eligible for vote");
		}
	}
}