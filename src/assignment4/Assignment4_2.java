package assignment4; // package declaration is compulsory.

/*
 This program will help you understand the concepts of Is-a Relationship and Has-a Relationship.
 */
class Car // Parent class
{
	// Variable declaration  
	private String color;
	private int maxSpeed;
	
	public void setColor(String color) // Method to set the color
	{
		this.color=color;
	}
	
	public void setMaxSpeed(int maxSpeed) // Method to set the speed
	{
		this.maxSpeed=maxSpeed;
	}
	
	public void carInfo() // Method to print the car information(color,speed)
	{
		System.out.println("Printing the Car Details .......");
		System.out.println("Car Color : "+color+" Maximum Speed : "+maxSpeed+" KMPH");
	}
}

class Engine // Engine Class for Has-a Relationship
{
	public void Start() 
	{
		System.out.println("Engine Started");
	}
	
	public void Stop()
	{
		System.out.println("Engine Stopped");
	}
}

class Maruti extends Car // Maruti class Inheriting Car Class which shows Is-a Relationship
{
	public void marutiStartStop()
	{
		Engine myEngine=new Engine(); // Creating object of Engine class 
		//calling the methods 
		myEngine.Start(); 
		myEngine.Stop();
	}
}

public class Assignment4_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Maruti myMaruti=new Maruti(); // Creating object of Maruti class 
		//calling the methods 
		myMaruti.setColor("Blue");
		myMaruti.setMaxSpeed(150);
		myMaruti.carInfo();
		myMaruti.marutiStartStop();
	}

}
