/* simple if statement */
import java.util.Scanner;
class simple
{
	public static void main(String[] args)
	{
		int age;
		System.out.println("Enter Your Age:");
		Scanner r=new Scanner(System.in);
		age=r.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		System.out.println("Thank You");
	}
}

/*  -->if block condition is true the execute if statement
    -->out side of if block statement is execute either condition is true or false
*/