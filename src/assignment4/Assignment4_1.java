package assignment4; // package declaration is compulsory.

/*
 * This program will help you to understand the concept of Method Overloading and Method Overriding.
 */
class OverLoadRide
{
	public double area() //overloading method without any parameter
	{
		double radius=5.5;
		return (3.14*radius);
	}
	
	public void area(float side) //overloading method with one parameter
	{
		System.out.println("Area of Square is : "+side*side);
	}
	
	public void area(float length,float width) //overloading method with two parameters
	{
		System.out.println("Area of Rectangle is : "+length*width);
	}
	
	public void methodOverride() //parent class overriding method
	{
		System.out.println("This is parent class method");
	}
}

class Methodoverloadride extends OverLoadRide
{
	public void methodOverride() //child class overriding method
	{
		System.out.println("This is child class method");
	}
}


public class Assignment4_1 
{

	public static void main(String[] args)  // main method starts
	{
		// TODO Auto-generated method stub
		
		OverLoadRide obj=new OverLoadRide(); // Base class reference and object
		OverLoadRide obj1=new Methodoverloadride(); // Base class reference but derived class object
		
		double circleArea=obj.area(); // calling overloading method without parameter
		System.out.println("Area of circle is : "+circleArea);
		obj.area(10); // calling overloading method with one parameter
		obj.area(13,15); // calling overloading method with two parameters
		
		
		obj.methodOverride(); // call to Base class overriding method
		
		obj1.methodOverride(); // call to Derived class overriding method
	}

}
