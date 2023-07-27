/* parlindrome Number Program */
//input number then check this is parlindrome or not
//input number 121 --> reverse the number and get output as same number then those number is parlindrome

import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		int n,c,s=0,r;
		System.out.println("Enter any number:");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;  //logic for parlindrome number
			n=n/10;
		}
		
		if(c==s)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}
}

/*  -->Palindrome number it means given number and it's reverse is same the those number is called palindrome number
*/