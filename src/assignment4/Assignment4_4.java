package assignment4; // package declaration is compulsory.
import java.util.Scanner; // importing Scanner class from utility package
/*
 This program will accept a number from user and calculate the aliquot sum of the number, check whether the number is perfect number 
 and also print all the aliquot numbers between 1 to 100.  
 */
class Aliquot
{
	
	// method to calculate the aliquot sum and check whether the number is perfect or not
	void aliquotSum(int num) 
	{
		// variables declaration
		int start=2;
		int result=1;
		int divideTill=num/2;
		int remainder=0;
		
		// logic to print aliquot sum of number
		while (start <= divideTill)
		{
			remainder=num%start;
			if(remainder == 0)
			{
				result=result+start;
			}
			start++;
		}
		System.out.println("Aliquot sum of number = "+result);
		
		// logic to check whether number is perfect or not
		if (num == result)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
		
	}
	
	// method to print all the perfect aliquot numbers between 1 to 100 
	void printAliqoutNumbers(int number)
	{
		// variables declaration
		int start=2;
		int result=1;
		int divideTill=number/2;
		int remainder=0;
		
		// logic to print all the perfect aliquot numbers between 1 to 100 
		while (start <= divideTill)
		{
			remainder=number%start;
			if(remainder == 0)
			{
				result=result+start;
			}
			start++;
		}
		
		if (number == result)
		{
			System.out.println(result);
		}
		
	}
}

public class Assignment4_4 // main class
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		// variables declaration
		int num;
		int allNumbers=1;
		Scanner input = new Scanner(System.in); // scanner to take input from the user.
		System.out.println("Enter the number : ");
		num=input.nextInt(); // Initializing the number
		input.close();
		Aliquot obj = new Aliquot(); // creating the object of Aliquot class
		obj.aliquotSum(num); // calling the method of Aliquot class
		
		System.out.println("Following are aliquot numbers between 1 to 100 : ");
		
		// loop to check perfect numbers between 1 to 100
		while(allNumbers <= 100)
		{
			obj.printAliqoutNumbers(allNumbers);
			allNumbers++;
		}

	}

}
