class Triangle
{
	double base, height;
	Triangle(double b, double h)
	{
	base =b; 
	height =h;
	}
	public String toString()
	{
		System.out.println("within toString method");
		System.out.println();
		return("Base: "+base+", Height: "+height);
		
		
	}
	
}

class ToStringTest
{
	public static void main(String args[])
	{
	Triangle t= new Triangle(4.6,8.5);
	String s= "triangle t :- "+ t;
	System.out.println(s);
	System.out.println();System.out.println();
	
	System.out.println("after printing the string s");
	System.out.println();
	
	System.out.println(t);
	System.out.println();
	System.out.println("after printing the object t as a string");

	}
}