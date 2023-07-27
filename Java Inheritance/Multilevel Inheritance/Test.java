/* multi level Inheritance */

class A
{
	int a,b,c;
	
	void add()
	{
		a=10;
		b=20;
		c=a+b;
		
		System.out.println("Sum of two numbers:"+c);
	}
	
	void sub()
	{
		a=200;
		b=100;
		c=a-b;
		
		System.out.println("Subtraction of two numbers:"+c);
	}
}

class B extends A
{
	void multi()
	{
		a=10;
		b=20;
		c=a*b;
		
		System.out.println("multiplication of two numbers:"+c);
	}
	
	void div()
	{
		a=10;
		b=20;
		c=b/a;
		
		System.out.println("Division of two numbers:"+c);
	}
}

class C extends B
{
	void rem()    //remainder
	{
		a=10;
		b=3;
		c=a%b;
		
		System.out.println("Remainder of two numbers:"+c);
	}
}

class Test      // main method dealare in new class Test
{
	
	public static void main(String[] args)   //main method
	{
		C r=new C(); // class c make object because class content all the features of all class
		
		r.add();   /* call the methods*/
		r.sub();
		r.multi();
		r.div();
	}
}



/*  -->In this program we make main method in saperate class Whose class name is Test
    --> class c make object
*/
