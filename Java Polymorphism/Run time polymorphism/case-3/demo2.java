/*not method overriding */

class shape   //super class
{
	static void draw()
	{
		System.out.println("can't say shape type");
	}
}	
class square extends shape   //sub class
{
	void draw2()
	{
		System.out.println("square shape");
	}
}

class demo2
{
	public static void main(String[] args)
	{
		shape r=new square();  
		r.draw();
	}
}    

/*  -->In this case method is not override so we make object of sub class with reference to super class 
    -->method override na hovathi superclass ni method call thy
*/

