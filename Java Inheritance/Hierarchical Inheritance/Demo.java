/* Hierarchical Inheritance */

class A  //super class
{
   void input()
   {
	   System.out.println("Enter your name:");
   }
}

class B extends A  //sub class-1
{
	void show()
	{
		System.out.println("My name is vasu");
	}
}

class C extends A //sub class-2
{
	void disp()
	{
	    System.out.println("My name is Rocky");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		B r=new B();    //class B make object 
		C r1=new C();   // class C make object
		
		r.input();
		r.show();
		
		r1.input();
		r1.disp();
	}
}

/*  -->In this case we make two class as object class B and class C
    --> class A na features class B or class C both ma hase
	--> class B content input() , show() methods
	--> class C content input() , disp() methods
*/