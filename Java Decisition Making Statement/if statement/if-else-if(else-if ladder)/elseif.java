/* if-else if statement */
import java.util.Scanner;
class elseif
{
	public static void main(String[] args)
	{
		int marks;
		System.out.print("Enter your marks:\n");
		Scanner r=new Scanner(System.in);
		marks=r.nextInt();
		
		if(marks>80)
		{
			System.out.println("Topper");
		}
		else if(marks<80 && marks>=60)
		{
			System.out.println("First");
		}
		else
		{
			System.out.println("Second");
		}
	}
}

/*  -->In this case last else is first if block's
    -->any all of statement not execute then last else statement is execute
	*/