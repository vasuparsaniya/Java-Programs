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
	//override method
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


/*  -->make object of sub class
    -->overriding ma suepr class and sub class ni method same hoy 
*/