/* In simple Inheritance super class variable or method make protected then saw what is out put?  */

class student  //super class
{
	 protected int roll,marks;    //make variable as protected
	String name; 
    
    protected void input()     // make method as protected
	{
     System.out.println("Enter roll,name & marks:");
	}
}

class queen extends student    //sub class
{
	void disp()
	{
        roll=1;
		name="vasu";
		marks=89;
		
		System.out.println(roll+ " " +name+ " " +marks);
	}
	
	public static void main(String[] args)
	{
	    queen r=new queen();     //make object of sub class because sub class content all feature of super class
		r.input();
		r.disp();
	}
}	


/* --> In this case method or variable is in protected but does't get error
*/