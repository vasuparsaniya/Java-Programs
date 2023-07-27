/*Logical operator */

import java.util.Scanner;
class Logical
{
	 public static void main(String[] args)
	 {
		 int a,b;
		 System.out.println("Enter two number:");
		 Scanner obj=new Scanner(System.in);
		 a=obj.nextInt();
		 b=obj.nextInt();
		 System.out.println("..........logical AND..........");
		 System.out.println((a>b) && (a>b));
		 System.out.println((a<b) && (a<b));
		 System.out.println((a>b) && (a<b));
		 System.out.println((a<b) && (a>b));
		 
		 System.out.println("..........logical OR..........");
		 System.out.println((a>b) || (a>b));
		 System.out.println((a<b) || (a<b));
		 System.out.println((a>b) || (a<b));
		 System.out.println((a<b) || (a>b));
		 
		 System.out.println("..........logical NOT..........");
		 System.out.println(!(a>b));//[a>b is true then result is false] [a>b is false then result is true]
		 System.out.println(!(a<b));//[a<b is true then result is false] [a<b is false then result is true]
		 
		 System.out.println("..........logical XOR..........");
		 System.out.println((a>b) ^ (a>b));
		 System.out.println((a<b) ^ (a<b));
		 System.out.println((a>b) ^ (a<b));
		 System.out.println((a<b) ^ (a>b));

		 
	 }
}