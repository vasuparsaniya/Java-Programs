class variable
{
	int a=10;  //Instance variable
	static int b=20;  //Static variable
		
	public static void main(String[] args)
	{
		int c=30;        // Local variable
		final int D=40;  //final variable
		
		variable r=new variable();
	
		System.out.println(r.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(D);
	}
}

/* -->Instance variable call through object of class
   -->Static variable,local variable,final variable does't need object
*/