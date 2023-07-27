/* vowel or consonant in java*/
// a,e,i,o,u ---->vowel
// other is ---->consonant

import java.util.Scanner;
class check
{
	public static void main(String[] args)
	{
		char ch;
	System.out.println("Enter Any Character:");
    Scanner r=new Scanner(System.in);
    ch=r.next().charAt(0);

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	{
		System.out.println("Character is vowel");
	}
	else
	{
		System.out.println("character is consonant");
	}
	}
}

/*  -->charAt(Position); is method of string class
*/