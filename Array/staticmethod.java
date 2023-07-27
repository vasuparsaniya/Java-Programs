/*static method of array   like 
  tostring(), asList(), deepToString()
*/

import java.util.Arrays;
class staticmethod
{
	public static void main(String[] args)
	{
		String a[]={"Learn","coding","Keypoints","Education"};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.asList(a));
		
		int arr[][]={{10,20},{30,40}};
		System.out.println(Arrays.deepToString(arr));
	}
}  

/* -->Arrays class java na util package ma che
   -->staticmethod do not need make object of class
   -->deepToString() metho e two dimensional arry mate che
   -->This method out put is in form of square bracket
   */