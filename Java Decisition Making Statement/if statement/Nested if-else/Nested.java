/* Nested if else statement */

class Nested
{
	public static void main (String[] args)
	{
		int a=10,b=20,c=30;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
		
	}
}

/* -->First if block ma rahel if-else block e nested if-else che
       tej if na else part ma rahel pan Nested if-else che
*/