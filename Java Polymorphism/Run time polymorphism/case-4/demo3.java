/* method overriding */

class shape  //super class
{
	void draw()
	{
		System.out.println("can't say shape type");
	}
}

class square extends shape  //sub class
{
	//method override
	void draw()
	{
		super.draw();   //super class ni method call 
		System.out.println("square shape");
	}
}

class demo3
{
	public static void main(String[] args)
	{
		shape r=new square();
		r.draw();
	}
}

/*  -->In this case we print super class method also
        so we do super.draw(); in subclass methods
		and we get out put as super or sub class methods both
*/