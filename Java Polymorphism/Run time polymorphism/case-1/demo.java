/* Run time polymorphism */
/* Method overriding */

class shape   // shape is parent class
{
	void draw()
	{
		System.out.println("can't say shape type");
	}
}

class square extends shape  //square is sub class
{
	//@override
	void draw()
	
	{
		System.out.println("square shape");
	}
}

class demo
{
	public static void main (String[] args)
	{
		shape r=new square();   //make object of subclass
		
		r.draw();
	}
}


/*  --> 
*/