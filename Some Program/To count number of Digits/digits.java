/* count number of Digits */
import  java.util.Scanner;
class digits
{
	public static void main(String[] args)
	{
		int n,count=0;  //local variable
		System.out.println("Enter any number:");
		Scanner r=new Scanner(System.in);  //making object of scanner class
		n=r.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("No. of digits:"+count);
	}
}

/*  -->count++ e count kare ke ketli var number 10 vade divide thay che
*/