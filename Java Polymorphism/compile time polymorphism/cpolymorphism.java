/*    compile time polymorphism   */
/* Method Overloading */

class cpolymorphism
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	void add(int x,int y) 
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	
	void add(int x,double y)    
	{
		double c;
		c=x+y;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		cpolymorphism ref=new cpolymorphism();   //making object
		
		ref.add();
		ref.add(100,200);   //input take in parameter
		ref.add(50,45.35);  //input take in parameter 
	}
}

/*  -->methodoverloading ma method name  same hoy but different parameter hoy

*/