/*Tax calculation program */
//take input as salary and calculate tax on this salary
//salary<=10000------>No pay tax
//salary>10000 && salary<=100000------>10% pay tax
//salary>100000------>20% pay tax

import java.util.Scanner;
class tax
{
	public static void main(String[] args)
	{
		int sal;
		double tax,total;
		System.out.println("Enter your salary:");
		Scanner r=new Scanner(System.in);
		sal=r.nextInt();
		
		if(sal<=10000)
		{
			System.out.println("salary is:"+sal+" "+"No Pay Tax");
		}
		else if(sal>10000 && sal<=100000)
		{
			tax=sal*0.10;
			System.out.println("salary is:"+sal+" "+"Tax on salary:"+tax);
		}
		else   //salary>100000------>20% pay tax
		{
			tax=sal*0.20;
			System.out.println("salary is:"+sal+" "+"Tax on salary:"+tax);
		}
	}
}