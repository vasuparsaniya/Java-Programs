/* Print character in Java */
import java.util.Scanner;
class charPrint 
{
	public static void main(String[] args)
	{
		int pos;
		char ch;
		System.out.println("Enter the position of character/string which you want to print:");
		Scanner r=new Scanner(System.in);	
		pos=r.nextInt();
		System.out.println("Enter character/string:");
		ch=r.next().charAt(pos);//for character input
		System.out.println("character is:"+ch);
		
	}
}