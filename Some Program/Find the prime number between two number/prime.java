/* Prime numbers between two number */

import java.util.Scanner;
class prime
{
	public static void main(String[] args)
	{
		int n1,n2,i,j;
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter First number:");
		n1=ref.nextInt();
		System.out.println("Enter Scond number:");
        n2=ref.nextInt();
		
		for(i=n1; i<=n2; i++)
		{
			for(j=2; j<=i; j++)
			{
				if(i%j==0)
				{
					break;  //it means we take i=10,j=2 then i%j==0 break;
				}
			}
				if(i==j)
				{
					System.out.print(j+" ");
				}
		}
	}
}