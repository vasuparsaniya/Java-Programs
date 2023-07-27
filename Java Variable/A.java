class A
{
	static int a=10;   //static variable
	
	void fun()
	{
		int b=10;  //local variable
		System.out.println(a+" "+b);
		++a;
		++b;
	}
	
	public static void main(String[] args)
	{
		A r=new A();  //making object
		
		r.fun();
		r.fun();
	}
}

/*  -->In this case a is static variable so increment a (++a) every time increment at same location
       but b is local variable so increment b (++b) every time create new memory so old memory loss then every time b has same value 
	   -->Every time when call fun method a is increment but b is not increment 
*/