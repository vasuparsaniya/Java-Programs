/*convert character uppercase to lowercase and vice-versa */
//input character a to z ---->uppercase
//input character A to Z ---->lowercase

import java.util.Scanner;
import java.lang.Character;
class convert
{
	public static void main(String[] args)
	{
		char ch,ch2;
		System.out.println("Enter the character:");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			ch2=Character.toLowerCase(ch);
			System.out.println("Lowercase:"+ch2);
		}
		else
		{
			ch2=Character.toUpperCase(ch);
			System.out.println("Uppercase:"+ch2);
		}
	}
}

/*  -->toUpperCase(); toLoweCase();  method e Character class ni method che je Character class e lang package ma che
*/ 