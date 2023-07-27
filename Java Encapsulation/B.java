/* Java Encapsulation  */
import java.util.Scanner;
class A
{
    private int value; //data hiding

    public void setValue(int x)   //data abstraction
{
      value=x;
}

    public int getValue()
	{
     return value;
	}
}

class B
{
	public static void main(String[] args){
		//int a;
		//Scanner obj=new Scanner(System.in);   
		//a=obj.nextInt();
		A r=new A();
		r.setValue(100);
		System.out.print(r.getValue());
	}
}


	