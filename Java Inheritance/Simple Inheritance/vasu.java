/* simple Inheritance*/

class student  //super class
{
	int roll,marks;
	String name;
    
    void input()
	{
     System.out.println("Enter roll,name & marks:");
	}
}

class vasu extends student    //sub class
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
	    vasu r=new vasu();     //make object of sub class because sub class content all feature of super class
		r.input();
		r.disp();
	}
}	