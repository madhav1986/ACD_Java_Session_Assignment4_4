package assignment4; // package declaration is compulsory.
/*
 This program will help you understand the concepts of inheritance and final keyword.
 */
class Base // Base class
{
	// declaring final variable
	final int value=100;
	
	// declaring normal variable
	int value1=101;
	
	// final method
	final void displayMessage()
	{
		System.out.println("This is final method can't be overriden");
	}
}

class Derived extends Base // Derived class extending Base class
{
	// variable declaration
	int value=99;

}

// this is final class it can't be inherited
final class FinalClass
{
	void welcomeMessage()
	{
		System.out.println("Welcome .....! Inside the final class");
	}
}

public class Assignment4_3 
{

	public static void main(String[] args)  // Main method
	{
		// TODO Auto-generated method stub
		Base obj=new Base(); // creating the object of base class
		obj.value1=90; // we can change the value of static variable but not final variable
		System.out.println("Final variable value = "+obj.value);
		System.out.println("Static variable value = "+obj.value1);
		
		// Call to final method
		obj.displayMessage(); 
		
		Base obj1=new Derived(); // creating the object of base class through base class reference
		System.out.println(obj1.value);
		
		FinalClass fc=new FinalClass(); // creating the object of final class
		fc.welcomeMessage();
	
		
	}

}
