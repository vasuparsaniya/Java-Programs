/* Perfect number check */
//input 6 --> 1,2,3,4,5 and 6 is divisible by 1,2,3 so 1+2+3=6 then 6 is perfect number 
import java.util.Scanner;
class perfect
{
	public static void main(String[] args)
	{
		int n,sum=0;
		System.out.println("Enter any number:");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("This number is Perfect number");
		}
		else
		{
			System.out.println("This number is not perfect number");
		}
	}
} 

/*  -->Perfect number means te number karta small number ma ava number ke je apela number ne devide karta hova joie 
      to te badha number no sumation karta Given number made to given number e perfect number che
*/