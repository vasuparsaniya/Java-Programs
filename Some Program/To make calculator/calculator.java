/*make calculator in java */
//make calculator without use of switch statement
//take input as two number
//select operation
//print out put

import java.util.Scanner;
class calculator
{
	public static void main(String[] args)
	{
		int n1,n2,ch,cal;
		double div;
		System.out.println("Enter the two numbers:");
		Scanner r=new Scanner(System.in);
		n1=r.nextInt();
		n2=r.nextInt();
		
		System.out.println("**********************Operation********************");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("5.REMAINDER");
		System.out.println("Enter your choice:");
		
		ch=r.nextInt();
		
		if(ch==1)
		{
			cal=n1+n2;
			System.out.println("Addition:"+cal);
		}
		else if(ch==2)
		{
				cal=n1-n2;z
			System.out.println("Subtraction:"+cal);
		}
			else if(ch==3)
		{
				cal=n1*n2;
			System.out.println("Multiplication:"+cal);
		}
			else if(ch==4)
		{
				 div=(double) n1/n2;  //Explicit type casting
			System.out.println("Division:"+div);
		}
			else if(ch==5)
		{
				cal=n1%n2;
			System.out.println("Remainder:"+cal);
		}
	}
}