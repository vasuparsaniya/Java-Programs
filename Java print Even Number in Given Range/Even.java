/* Print Even number in given range */

import java.util.Scanner;
class Even
{
	public static void main(String[] args)
	{
		int n;
		System.out.print("Enter number till you want to print odd number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=0;i<=n;i=i+2)
		{
			System.out.print(i+" ");
		}
	}
}

/*  -->i=0 thi start thay che jethi i=i+2
       jo i=1 thi start thay to i=i+1
*/