/* Scanner Class */

import java.util.Scanner;
class scanner
{
	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter Data");
		
		Scanner obj=new Scanner(System.in);  //making scanner class object
        a=obj.nextInt();  //scanner class method which is excess by scanner cvlass object
   
        System.out.println("Get Data:"+a);   
	}
}