/* Increment/Decrement operator */

class Prepost
{
	public static void main(String[] args)
	{
		int a=10;
		System.out.println("Current number:"+a);
		System.out.println("..........Prepost Increment..........");
		System.out.println("Post Increment:"+(a++));
						System.out.println("Current number:"+a);  //for chacking current value of a
		System.out.println("Pre Increment:"+(++a));
		
		
		System.out.println("..........Prepost Decrement..........");
		System.out.println("Post Decrement:"+(a--));
								System.out.println("Current number:"+a);  //for chacking current value of a
		System.out.println("Pre Decrement:"+(--a));		

	}
}

/*  -->In post increment/decrement(a++ / a--) ma pela value print thy pach iincrement/decrement thay
    -->In pre incremet/decrement(++a/--a) ma pela increment/decrement thay pachi value print thay
*/	