/* print ASCII value of character */

import java.util.Scanner;
class ASCII
{
	public static void main(String[] args)
	{
		char ch;
		System.out.println("Enter Any character:");
		Scanner r=new Scanner(System.in);
		
		ch=r.next().charAt(0);
		
		int a=ch;  //implicit type casting   char(8 bit)--->int(32 bit)
		System.out.println("ASCII value of"+" "+ch+" "+"is"+" "+a);
	}
}