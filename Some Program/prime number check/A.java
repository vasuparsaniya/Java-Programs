/* Prime number */
//input any number then check this prime or not

import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		int n,count=0;
		System.out.println("Enter any number:");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)   //any number is divisible by 1 and itself
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
}