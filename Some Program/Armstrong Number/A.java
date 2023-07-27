/*Armstrong number*/
// input 153  -->  1^3 + 5^3 + 3^3 =1 + 125 + 27= 153 

import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		int n,r,arm=0,c;
		System.out.println("Enter any number:");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		c=n;
		while(n>0)
		{
			r=n%10;
			arm=(r*r*r) + arm;
            n=n/10;			
		}
		if(c==arm)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Nuymber is not Armstrong");
		}
	}
}

/*  -->Armstrong number mean Given numver's all digits cube then sum and get answer is same number then given number is called Armsrong number
*/ 