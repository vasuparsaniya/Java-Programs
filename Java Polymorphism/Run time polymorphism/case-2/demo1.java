/*method overriding */

class shape  //superclass
{

}

class square extends shape  //sub class
{
	void draw()
	
	{
		System.out.println("square shape");
	}
}

class demo1  
{
	public static void main(String[] args)
	{
		shape r=new square();   //make subclass object reference of superclass
		
		r.draw();
	}
}

/*  -->In this case methood superclsaa does't content method which is in subclass so we get error
    -->overriding ma je method subclass ma hoy te superclass ma hovi joie

*/

